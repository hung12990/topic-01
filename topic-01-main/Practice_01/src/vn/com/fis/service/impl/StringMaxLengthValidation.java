package vn.com.fis.service.impl;

import vn.com.fis.service.IValidation;

public class StringMaxLengthValidation implements IValidation{
	
	private int length;
	
	

	public StringMaxLengthValidation(int length) {
		this.length = length;
	}


	@Override
	public boolean validate(String data) {
		if(data == null) {
			return false;
		}
		return data.trim().length() <= length;
	}

}
