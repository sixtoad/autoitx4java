package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum MouseWheelDirection {
	UP("up"), DOWN("down");
	
	private String direction;
	
	private MouseWheelDirection(String direction) {
		this.direction = direction;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	private static final Map<String, MouseWheelDirection> $ENUM_LOOKUP = new HashMap<String, MouseWheelDirection>();
    
	static {
      for (MouseWheelDirection button : MouseWheelDirection.values()) {
        $ENUM_LOOKUP.put(button.direction, button);
      }
    }
    
	public static MouseWheelDirection findByDirection(final String direction) {
      if ($ENUM_LOOKUP.containsKey(direction)) {
        return $ENUM_LOOKUP.get(direction);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'MouseWheelDirection' has no value for 'direction = %s'", direction));
    }
	
}
