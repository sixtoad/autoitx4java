package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Changes how "keys" is processed
 * @author cantolls
 *
 */
public enum KeyFlag {
	/**
	 * (default), Text contains special characters like + to indicate SHIFT and {LEFT} to indicate left arrow.
	 */
	SPECIAL_CHARS(0),
	/**
	 * Keys are sent raw.
	 */
	RAW(1);
	
	private int mode;
	
	private KeyFlag(int mode) {
		this.mode = mode;
	}
	
	public int getMode() {
		return this.mode;
	}
	
	private static final Map<Integer, KeyFlag> $ENUM_LOOKUP = new HashMap<Integer, KeyFlag>();
    
	static {
      for (KeyFlag keyFlag : KeyFlag.values()) {
        $ENUM_LOOKUP.put(keyFlag.mode, keyFlag);
      }
    }
    
	public static KeyFlag findByMode(final Integer mode) {
      if ($ENUM_LOOKUP.containsKey(mode)) {
        return $ENUM_LOOKUP.get(mode);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'KeyFlag' has no value for 'mode = %s'", mode));
    }
	
}
