package vn.com.fis.ui;

import vn.com.fis.service.IValidation;

public class InputComponent {
	private IValidation validation;
	private String data;
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void display() {
		
	}

	public void setValidation(IValidation validation) {
		this.validation = validation;
	}
	
	public boolean validate() {
		return this.validation.validate(this.data);
	}
}
