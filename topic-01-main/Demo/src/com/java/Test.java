package com.java;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		IDemo iDemo = new Demo(1);
		((Demo)iDemo).display();
	}
	
}
