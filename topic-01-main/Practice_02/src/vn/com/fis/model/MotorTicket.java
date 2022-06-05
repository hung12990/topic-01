package vn.com.fis.model;

public class MotorTicket extends VehicleTicket{
	private String number;

	public MotorTicket(int code, String number) {
		super(code);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + " number=" + number;
	}

	
}
