package vn.com.fis.domain;

public enum Price {
	BIKE_PRICE(500),
	MOTOR_PRICE(1000),
	TAX_PERCENT(10),
	LABOR_COST(100);
	
	private int price;
	
	private Price(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
