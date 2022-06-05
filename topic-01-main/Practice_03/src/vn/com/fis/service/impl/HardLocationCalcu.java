package vn.com.fis.service.impl;

import vn.com.fis.service.Calculator;

public class HardLocationCalcu extends Calculator{



	public HardLocationCalcu(int hp, int s, int d, String t) {
		super(hp, s, d, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatorF() {
		return (-1.0 * this.getD() * this.getS())/1000;
	}

}
