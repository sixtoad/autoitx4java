package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * A flag which determines what priority to set
 * @author cantolls
 *
 */
public enum FlagPriority {
	IDLE(0),BELOW_NORMAL(1),NORMAL(2),ABOVE_NORMAL(3),HIGH(4),REALTIME(5);
	
	private int priority;
	
	private FlagPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	private static final Map<Integer, FlagPriority> $ENUM_LOOKUP = new HashMap<Integer, FlagPriority>();
    
	static {
      for (FlagPriority flagPriority : FlagPriority.values()) {
        $ENUM_LOOKUP.put(flagPriority.priority, flagPriority);
      }
    }
    
	public static FlagPriority findByPriority(final Integer priority) {
      if ($ENUM_LOOKUP.containsKey(priority)) {
        return $ENUM_LOOKUP.get(priority);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'FlagPriority' has no value for 'priority = %s'", priority));
    }
	
}
