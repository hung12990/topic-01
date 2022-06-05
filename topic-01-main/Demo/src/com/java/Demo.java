package com.java;

public class Demo implements IDemo{
	private int code;

	public Demo(int code) {
		super();
		this.code = code;
	}

	public void display() {
		System.out.println("Demo");
	}
	
}

