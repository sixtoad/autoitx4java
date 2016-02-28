package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum ShowWindowMode {
	/**
	 * Minimizes the specified window and activates the next top-level window in
	 * the Z order.
	 */
	HIDE(0),

	/**
	 * Activates and displays the window. If the window is minimized or
	 * maximized, the system restores it to its original size and position. An
	 * application should specify this flag when restoring a minimized window.
	 */
	RESTORE(9),

	/**
	 * Activates the window and displays it in its current size and position.
	 */
	SHOW(5),

	/**
	 * Sets the show state based on the value specified by the program that
	 * started the application.
	 */
	SHOW_DEFAULT(10),

	/**
	 * Activates the window and displays it as a maximized window.
	 */
	SHOW_MAXIMIZED(3),

	/**
	 * Activates the window and displays it as a minimized window.
	 */
	SHOW_MINIMIZED(2),

	/**
	 * Displays the window as a minimized window. This value is similar to
	 * SHOWMINIMIZED, except the window is not activated.
	 */
	SHOW_MIN_NO_ACTIVE(7),

	/**
	 * Displays the window in its current size and position. This value is
	 * similar to SHOW, except the window is not activated.
	 */
	SHOW_NO_ACTIVE(8),

	/**
	 * Displays a window in its most recent size and position. This value is
	 * similar to SHOWNORMAL, except the window is not actived.
	 */
	SHOW_NO_ACTIVATE(4),

	/**
	 * Activates and displays a window. If the window is minimized or maximized,
	 * the system restores it to its original size and position. An application
	 * should specify this flag when displaying the window for the first time.
	 */
	SHOW_NORMAL(1);

	private int showMode;

	private ShowWindowMode(int showMode) {
		this.showMode = showMode;
	}

	public int getShowMode() {
		return this.showMode;
	}
	
	private static final Map<Integer, ShowWindowMode> $ENUM_LOOKUP = new HashMap<Integer, ShowWindowMode>();
    
	static {
      for (ShowWindowMode shwm : ShowWindowMode.values()) {
        $ENUM_LOOKUP.put(shwm.showMode, shwm);
      }
    }
    
	public static ShowWindowMode findByShowWindowsMode(final Integer showMode) {
      if ($ENUM_LOOKUP.containsKey(showMode)) {
        return $ENUM_LOOKUP.get(showMode);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'ShowWindowMode' has no value for 'ShowWindowMode = %s'", showMode));
    }
	
}
