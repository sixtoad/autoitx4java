package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum AutoItSetOption {
	/**
	 *  Sets the way coords are used in the caret functions, either absolute coords or coords relative to the current active window:
	 *  0 = relative coords to the active window
	 *	1 = absolute screen coordinates (default)
	 *	2 = relative coords to the client area of the active window 
	 */
	CaretCoordMode("CaretCoordMode"),
	/**
	 *	Alters the length of the brief pause in between mouse clicks.
	 *	Time in milliseconds to pause (default=10). 
	 */
	MOUSE_CLICK_DELAY("MouseClickDelay"),
	/**
	 *  Alters the length a click is held down before release.
	 *	Time in milliseconds to pause (default=10). 
	 */
	MOUSE_CLICK_DOWN_DELAY("MouseClickDownDelay"),
	/**
	 *  Alters the length of the brief pause at the start and end of a mouse drag operation.
	 *	Time in milliseconds to pause (default=250).
	 */
	MOUSE_CLICK_DRAG_DELAY("MouseClickDragDelay"),
	/**
	 * Sets the way coords are used in the mouse functions, either absolute coords or coords relative to the current active window:
	 *	0 = relative coords to the active window
	 *	1 = absolute screen coordinates (default)
	 *	2 = relative coords to the client area of the active window
	 */
	MOUSE_COORD_MODE("MouseCoordMode"),
	/**
	 * Sets the way coords are used in the pixel functions, either absolute coords or coords relative to the current active window:
	 *	0 = relative coords to the active window
	 *	1 = absolute screen coordinates (default)
	 *	2 = relative coords to the client area of the active window
	 */
	PIXEL_COORD_MODE("PixelCoordMode"),
	/**
	 * Specifies if AutoIt attaches input threads when using then Send() function. When not attaching (default mode=0) detecting the state of capslock/scrolllock and numlock can be unreliable under NT4. However, when you specify attach mode=1 the Send("{... down/up}") syntax will not work and there may be problems with sending keys to "hung" windows. ControlSend() ALWAYS attaches and is not affected by this mode.
	 *	0 = don't attach (default)
	 *	1 = attach 
	 */
	SEND_ATTACH_MOE("SendAttachMode"),
	/**
	 *  Specifies if AutoIt should store the state of capslock before a Send function and restore it afterwards.
	 *	0 = don't store/restore
	 *	1 = store and restore (default)
	 */
	SEND_CPASLOCK_MODE("SendCapslockMode"),
	/**
	 *	Alters the the length of the brief pause in between sent keystrokes.
	 *	Time in milliseconds to pause (default=5). Sometimes a value of 0 does not work; use 1 instead. 
	 */
	SEND_KEY_DELAY("SendKeyDelay"),
	/**
	 *	Alters the length of time a key is held down before released during a keystroke. For applications that take a while to register keypresses (and many games) you may need to raise this value from the default.
	 *	Time in milliseconds to pause (default=1).
	 */
	SEND_KEY_DOWN_DELAY("SendKeyDownDelay"),
	/**
	 * 	Specifies if hidden window text can be "seen" by the window matching functions.
	 *	0 = Do not detect hidden text (default)
	 *	1 = Detect hidden text 
	 */
	WIND_DETECT_HIDDEN_TEXT("WinDetectHiddenText"),
	/**
	 *  Allows the window search routines to search child windows as well as top-level windows.
	 *	0 = Only search top-level windows (default)
	 *	1 = Search top-level and child windows 
	 */
	WIND_SEARCH_CHILDREN("WinSearchChildren"),
	/**
	 *	Alters the method that is used to match window text during search operations.
	 *	1 = Complete / Slow mode (default)
	 *	2 = Quick mode
	 *	In quick mode AutoIt can usually only "see" dialog text, button text and the captions of some controls. In the default mode much more text can be seen (for instance the contents of the Notepad window).
	 *	If you are having performance problems when performing many window searches then changing to the "quick" mode may help.
	 */
	WIND_TEXT_MATCH_MODE("WinTextMatchMode"),
	/**
	 *	Alters the method that is used to match window titles during search operations.
	 *	1 = Match the title from the start (default)
	 *	2 = Match any substring in the title
	 *	3 = Exact title match
	 *	4 = Advanced mode, see Window Titles & Text (Advanced)
	 */
	WINT_TITLE_MATCH_MODE("WinTitleMatchMode"),
	/**
	 *	Alters how long a script should briefly pause after a successful window-related operation.
	 *	Time in milliseconds to pause (default=250). 
	 */
	WIN_WAIT_DELAY("WinWaitDelay");
	
	
	private final String autoItOption;
	
	private AutoItSetOption(final String autoItOption) {
		this.autoItOption = autoItOption;
	}
	
	public String getAutoItOption() {
		return this.autoItOption;
	}
	
	private static final Map<String, AutoItSetOption> $ENUM_LOOKUP = new HashMap<String, AutoItSetOption>();
    
	static {
      for (AutoItSetOption autoItOption : AutoItSetOption.values()) {
        $ENUM_LOOKUP.put(autoItOption.autoItOption, autoItOption);
      }
    }
    
	public static AutoItSetOption findByCode(final String autoItOption) {
      if ($ENUM_LOOKUP.containsKey(autoItOption)) {
        return $ENUM_LOOKUP.get(autoItOption);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'AutoItSetOption' has no value for 'autoItOption = %s'", autoItOption));
    }
}
