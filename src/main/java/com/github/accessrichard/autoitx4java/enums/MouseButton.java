package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum MouseButton {
	LEFT("left"),RIGHT("right"),MIDDLE( "middle"), MAIN("main"),MENU("menu"),PRIMARY("primary"),SECONDARY("secondary");
	
	private String button;
	
	private MouseButton (String button) {
		this.button = button;
	}
	
	public String getButton() {
		return this.button;
	}
	
	private static final Map<String, MouseButton> $ENUM_LOOKUP = new HashMap<String, MouseButton>();
    
	static {
      for (MouseButton button : MouseButton.values()) {
        $ENUM_LOOKUP.put(button.button, button);
      }
    }
    
	public static MouseButton findByButton(final String button) {
      if ($ENUM_LOOKUP.containsKey(button)) {
        return $ENUM_LOOKUP.get(button);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'MouseButton' has no value for 'button = %s'", button));
    }
	
}
