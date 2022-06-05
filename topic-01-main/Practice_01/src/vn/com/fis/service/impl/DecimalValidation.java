package vn.com.fis.service.impl;

import vn.com.fis.service.IValidation;

public class DecimalValidation implements IValidation{

	@Override
	public boolean validate(String data) {
		if(data == null) {
			return false;
		}
		try {
			data = data.trim();
			Double.parseDouble(data);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
}
