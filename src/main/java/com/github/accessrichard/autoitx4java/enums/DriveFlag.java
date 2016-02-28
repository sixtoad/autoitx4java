package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum DriveFlag {
	
		DEFAULT(0),
		/**
		 * Persistant mapping
		 */
		PERSISTANT(1),
		/**
		 * Show authentication dialog if required
		 */
		SHOW_AUTHENTICATION(8);

	private int mapType;
	
	private DriveFlag(int mapType) {
		this.mapType = mapType;
	}
	
	public int getMapType() {
		return this.mapType;
	}
	
	private static final Map<Integer, DriveFlag> $ENUM_LOOKUP = new HashMap<Integer, DriveFlag>();
    
	static {
      for (DriveFlag mapType : DriveFlag.values()) {
        $ENUM_LOOKUP.put(mapType.mapType, mapType);
      }
    }
    
	public static DriveFlag findByMapType(final Integer mapType) {
      if ($ENUM_LOOKUP.containsKey(mapType)) {
        return $ENUM_LOOKUP.get(mapType);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'DriveFlag' has no value for 'mapType = %s'", mapType));
    }
	
}
