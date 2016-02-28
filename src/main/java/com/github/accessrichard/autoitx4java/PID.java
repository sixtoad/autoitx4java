package com.github.accessrichard.autoitx4java;

public class PID {
	
	private int pid;
	
	public PID(int pid) {
		this.pid = pid;
	}
	
	public boolean isValid() {
		return this.pid!=0;
	}
	
	public String getProcess() {
		return ((Integer)pid).toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj instanceof PID) {
			isEqual =((PID)obj).getProcess().equals(this.getProcess());
		} else {
			isEqual = super.equals(obj);
		}
		return isEqual;
	}
}
