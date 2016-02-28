package com.github.accessrichard.autoitx4java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.github.accessrichard.autoitx4java.plumbing.AutoItX;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.BaseTSD.LONG_PTR;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.User32Util;
import com.sun.jna.platform.win32.WinDef.DWORDByReference;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;
import com.sun.jna.win32.StdCallLibrary;

public class AutoItXTest {

	@Test
	public void GivenCalcShouldStart() {
		AutoItX autoIt = new AutoItX();
		String id = ((Integer) autoIt.run("calc.exe")).toString();
		assertThat(id).isNotEqualTo("0");
		String checkID = ((Integer) autoIt.processExists(id)).toString();
		assertThat(checkID).isEqualTo(id);
		// autoIt.processClose(checkID);
	}

	@Test
	public void GivenTooltipShouldReturnTrue() {
		AutoItX autoIt = new AutoItX();
		String id = ((Integer) autoIt.run("calc.exe")).toString();
		assertThat(id).isNotEqualTo("0");
		/* boolean result = */autoIt.toolTip("Hello!", 10, 10);
		autoIt.sleep(3000);
		String checkID = ((Integer) autoIt.processExists(id)).toString();
		assertThat(checkID).isEqualTo(id);
		// autoIt.processClose(checkID);
		// assertThat(result).isTrue();

	}

	@Test
	public void testWindowList() {
		final User32 user32 = User32.INSTANCE;
		user32.EnumWindows(new WNDENUMPROC() {
			int count = 0;

			@Override
			public boolean callback(HWND hWnd, Pointer arg1) {
				char[] windowText = new char[512];
				user32.GetWindowText(hWnd, windowText, 512);
				String wText = Native.toString(windowText);

				// get rid of this if block if you want all windows regardless
				// of whether
				// or not they have text
				if (wText.isEmpty()) {
					return true;
				}
				if (wText.equals("Calculator")) {
					System.out.println("Found window with text " + hWnd + ", total " + ++count + " Text: " + wText);
					User32.INSTANCE.EnumChildWindows(hWnd, new WinUser.WNDENUMPROC() {
						@Override
						public boolean callback(HWND hWnd, Pointer data) {
							char[] controlText = new char[512];
							char[] controlContetnText = new char[512];
							char[] buttonTextMess = new char[512];
							// returns class name of the element.
							User32.INSTANCE.GetClassName(hWnd, controlText, 512);
							String className = Native.toString(controlText);
							User32.INSTANCE.GetWindowText(hWnd, controlContetnText, 512);
							String vControlText = Native.toString(controlContetnText);
							int message = User32Util.registerWindowMessage("WM_CONTROLNAME");
							DWORDByReference buttonText = new DWORDByReference();
							User32.INSTANCE.SendMessageTimeout(hWnd, message, 0L, 0L, WinUser.SMTO_ABORTIFHUNG, 1000, buttonText);
							// returns caption of the element.
							
							LONG_PTR ptrID = User32.INSTANCE.GetWindowLongPtr(hWnd, User32.GWL_ID);
							String caption = ptrID.toString();
							System.out.println("Found control with classname " + className + ", total " + ++count
									+ " id: " + caption+" text "+vControlText+" NET Name:"+buttonText.getValue().toString());
							return true;
						}
					}, null);
				}
				
				return true;
			}
		}, null);
	}

}
