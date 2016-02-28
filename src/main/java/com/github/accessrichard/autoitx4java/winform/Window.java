package com.github.accessrichard.autoitx4java.winform;

import java.util.List;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;

@Builder
public class Window {
	
	
	private @Singular List<Control> controls;
	
	private String name;
	
	private Integer id;

}
