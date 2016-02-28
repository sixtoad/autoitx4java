package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum ControlTreeViewCommand {
	/**
	 * Checks an item (if the item supports it). 
	 */
	CHECK("Check"), 
	/**
	 * Collapses an item to hide its children.
	 */
	COLLAPSE("Collapse"),
	/**
	 * Returns 1 if an item exists, otherwise 0.
	 */
	EXISTS("Exists"),
	/**
	 * Expands an item to show its children.
	 */
	EXPAND("Expand"),
	/**
	 * Returns the number of children for a selected item.
	 */
	GET_ITEM_COUNT("GetItemCount"),
	/**
	 * Returns the item reference of the current selection using the text reference of the item (or index reference if UseIndex is set to 1).
	 */
	GET_SELECTED("GetSelected"),
	/**
	 * Returns the text of an item.
	 */
	GET_TEXT("GetText"),
	/**
	 *  Returns the state of an item. 1:checked, 0:unchecked, -1:not a checkbox.
	 */
	IS_CHECKED("IsChecked"),
	/**
	 * Selects an item.
	 */
	SELECT("Select"),
	/**
	 * Unchecks an item (if the item supports it).
	 */
	UNCHECKED("Uncheck");
	
	private String command;
	
	private ControlTreeViewCommand(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	private static final Map<String, ControlTreeViewCommand> $ENUM_LOOKUP = new HashMap<String, ControlTreeViewCommand>();
    
	static {
      for (ControlTreeViewCommand command : ControlTreeViewCommand.values()) {
        $ENUM_LOOKUP.put(command.command, command);
      }
    }
    
	public static ControlTreeViewCommand findByCommand(final String command) {
      if ($ENUM_LOOKUP.containsKey(command)) {
        return $ENUM_LOOKUP.get(command);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'ControlTreeViewCommand' has no value for 'command = %s'", command));
    }
	
}
