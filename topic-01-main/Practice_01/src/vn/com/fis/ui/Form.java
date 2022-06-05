package vn.com.fis.ui;

import java.util.List;

public class Form {
	public List<InputComponent> components;
	
	public void addComponent(InputComponent inputComponent) {	
		components.add(inputComponent);
	}
	
	public boolean validateForm() {
		return false;
	}
}
