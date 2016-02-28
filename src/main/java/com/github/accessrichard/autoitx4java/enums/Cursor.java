package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum Cursor {
	/**
	 *  (this includes pointing and grabbing hand icons)
	 */
	UNKNOWN(0),
	APPSTARTING(1),
	ARROW(2),
	CROSS(3),
	HELP(4),
	IBEAM(5),
	ICON(6),
	NO(7),
	SIZE(8),
	SIZEALL(9),
	SIZENESW(10),
	SIZENS(11),
	SIZENWSE(12),
	SIZEWE(13),
	UPARROW(14),
	WAIT(15);
	
	private int idCursor;
	
	private Cursor(int idCursor) {
		this.idCursor = idCursor;
	}
	
	public int getIdCursor() {
		return this.idCursor;
	}
	
	private static final Map<Integer, Cursor> $ENUM_LOOKUP = new HashMap<Integer, Cursor>();
    
	static {
      for (Cursor cursor : Cursor.values()) {
        $ENUM_LOOKUP.put(cursor.idCursor, cursor);
      }
    }
    
	public static Cursor findByCursor(final Integer idCursor) {
      if ($ENUM_LOOKUP.containsKey(idCursor)) {
        return $ENUM_LOOKUP.get(idCursor);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'Cursor' has no value for 'cursor = %s'", idCursor));
    }
	
}
