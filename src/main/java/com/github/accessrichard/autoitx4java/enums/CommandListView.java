package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum CommandListView {
	DESELECT("DeSelect"),
	FIND_ITEM("FindItem"),
	GET_ITEM_COUNT("GetItemCount"),
	GET_SELECTED("GetSelected"), 
	GET_SELECTED_COUNT("GetSelectedCount"), 
	GET_SUB_ITEM_COUNT("GetSubItemCount"), 
	GET_TEXT("GetText"), 
	IS_SELECTED("IsSelected"),
	SELECT("Select"), 
	SELECT_ALL("SelectAll"), 
	SELECT_CLEAR("SelectClear"), 
	SELECT_INVERT("SelectInvert"), 
	VIEW_CHANGE("ViewChange");
	
	private String command;
	
	private CommandListView (String command) {
		this.command= command;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	private static final Map<String, CommandListView> $ENUM_LOOKUP = new HashMap<String, CommandListView>();
    
	static {
      for (CommandListView command : CommandListView.values()) {
        $ENUM_LOOKUP.put(command.command, command);
      }
    }
    
	public static CommandListView findByCommand(final String command) {
      if ($ENUM_LOOKUP.containsKey(command)) {
        return $ENUM_LOOKUP.get(command);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'AutoItSetOption' has no value for 'autoItOption = %s'", command));
    }
}
