package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Changes the current view
 * @author cantolls
 *
 */
public enum View {
	 LIST("list"),DETAILS("details"),SMALL_ICONS("smallicons"),LARGEICONS("largeicons");
	
	private String view;
	
	private View(String view) {
		this.view = view;
	}
	
	public String getView() {
		return this.view;
	}
	
	private static final Map<String, View> $ENUM_LOOKUP = new HashMap<String, View>();
    
	static {
      for (View button : View.values()) {
        $ENUM_LOOKUP.put(button.view, button);
      }
    }
    
	public static View findByView(final String view) {
      if ($ENUM_LOOKUP.containsKey(view)) {
        return $ENUM_LOOKUP.get(view);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'View' has no value for 'view = %s'", view));
    }
	
}
