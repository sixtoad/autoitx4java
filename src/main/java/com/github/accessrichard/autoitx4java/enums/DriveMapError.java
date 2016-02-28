package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum DriveMapError {
	UNDEFINED(1),
	/**
	 * Access to the remote share was denied
	 */
	DENIED(2),
	/**
	 * The device is already assigned
	 */
	ALREADY_ASSIGNED(3),
	/**
	 * Invalid device name
	 */
	INVALID_NAME(4),
	/**
	 * Invalid remote share
	 */
	INVALID_REMOTE_SHARE(5),
	/**
	 * Invalid password
	 */
	INVALID_PASSWORD(6);
	
	private int errorCode;
	
	private DriveMapError (int errorCode) {
		this.errorCode = errorCode;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	private static final Map<Integer, DriveMapError> $ENUM_LOOKUP = new HashMap<Integer, DriveMapError>();
    
	static {
      for (DriveMapError mapError : DriveMapError.values()) {
        $ENUM_LOOKUP.put(mapError.errorCode, mapError);
      }
    }
    
	public static DriveMapError findByMapType(final Integer mapError) {
      if ($ENUM_LOOKUP.containsKey(mapError)) {
        return $ENUM_LOOKUP.get(mapError);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'DriveMapError' has no value for 'mapError = %s'", mapError));
    }	
}
