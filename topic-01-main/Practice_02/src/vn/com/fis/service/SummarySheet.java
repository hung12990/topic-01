package vn.com.fis.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.com.fis.domain.Price;
import vn.com.fis.model.BikeTicket;
import vn.com.fis.model.MotorTicket;
import vn.com.fis.model.VehicleTicket;

public class SummarySheet {
	
	private Date date;
	
	private List<VehicleTicket> tickets ;
	
	public SummarySheet() {
		date = new Date();
		tickets = new ArrayList<>();
	}

	//public method
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<VehicleTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<VehicleTicket> tickets) {
		this.tickets = tickets;
	}

	//method to get total amount
	public double getAmount() {
		double amount = 0.0;
		for(VehicleTicket v: tickets) {
			if(v instanceof BikeTicket) {
				amount += Price.BIKE_PRICE.getPrice();
			}else if(v instanceof MotorTicket){
				amount += Price.MOTOR_PRICE.getPrice();
			}
		}
		return amount;
	}
	
	//method to calculator interest

	public double getInterest() {
		double tax = getAmount() * Price.TAX_PERCENT.getPrice() / 100;
		double cost = count() * Price.LABOR_COST.getPrice();
		return getAmount() - (tax + cost);
	}

	//method to count all vehicle
	public int count() {
		return tickets.size();
	}

	@Override
	public String toString() {
		return "SummarySheet [date=" + date + ", amount=" + getAmount() + ", interest=" + getInterest() + "]";
	}
	
}
