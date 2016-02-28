package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum ControlMouseButton {
	LEFT("left"),RIGHT("right"),MIDDLE( "middle");
	
	private String button;
	
	private ControlMouseButton (String button) {
		this.button = button;
	}
	
	public String getButton() {
		return this.button;
	}
	
	private static final Map<String, ControlMouseButton> $ENUM_LOOKUP = new HashMap<String, ControlMouseButton>();
    
	static {
      for (ControlMouseButton button : ControlMouseButton.values()) {
        $ENUM_LOOKUP.put(button.button, button);
      }
    }
    
	public static ControlMouseButton findByDirection(final String direction) {
      if ($ENUM_LOOKUP.containsKey(direction)) {
        return $ENUM_LOOKUP.get(direction);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'ControlMouseButton' has no value for 'direction = %s'", direction));
    }
}
