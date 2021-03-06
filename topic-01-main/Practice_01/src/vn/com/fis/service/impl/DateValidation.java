package vn.com.fis.service.impl;

import java.text.SimpleDateFormat;

import vn.com.fis.service.IValidation;

public class DateValidation implements IValidation {

	private String format;
	
	

	public DateValidation() {
		this.format = "dd-mm-yyyy;mm-dd-yyyy";
	}



	@Override
	public boolean validate(String data) {
		if(data == null) {
			return false;
		}
		String[] formats = format.split(";");
		for (String s : formats) {
			SimpleDateFormat sdf = new SimpleDateFormat(s);
			try {
				sdf.parse(data);
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
		}
		return false;
	}
}
