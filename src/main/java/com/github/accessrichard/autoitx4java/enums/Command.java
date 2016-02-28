package com.github.accessrichard.autoitx4java.enums;

import java.util.HashMap;
import java.util.Map;

public enum Command {
	IS_VISIBLE("IsVisible"),
	IS_ENABLED("IsEnabled"),
	SHOW_DROP_DOWN("ShowDropDown"),
	HIDE_DROP_DOWN("HideDropDown"),
	ADD_STRING("AddString"),
	DEL_STRING("DelString"),
	FIND_STRING("FindString"),
	SET_CURRENT_SELECTION("SetCurrentSelection"),
	SELECT_STRING("SelectString"),
	IS_CHECKED("IsChecked"),
	CHECK("Check"),
	UNCHECK("UnCheck"),
	GET_CURRENT_LINE("GetCurrentLine"),
	GET_CURRENT_COL("GetCurrentCol"),
	GET_CURRENT_SELECTION("GetCurrentSelection"),
	GET_LINE_COUNT("GetLineCount"),
	GET_LINE("GetLine"),
	GET_SELECTED("GetSelected"),
	EDIT_PASTE("EditPaste"), 
	CURRENT_TAB("CurrentTab"), 
	TAB_RIGHT("TabRight"), 
	TAB_LEFT("TabLeft"); 
	
	private String command;

	private Command(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	private static final Map<String, Command> $ENUM_LOOKUP = new HashMap<String, Command>();
    
	static {
      for (Command autoItOption : Command.values()) {
        $ENUM_LOOKUP.put(autoItOption.command, autoItOption);
      }
    }
    
	public static Command findByCommand(final String command) {
      if ($ENUM_LOOKUP.containsKey(command)) {
        return $ENUM_LOOKUP.get(command);
      }
      throw new IllegalArgumentException(String.format("Enumeration 'AutoItSetOption' has no value for 'autoItOption = %s'", command));
    }
	
}
