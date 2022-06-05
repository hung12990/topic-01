package vn.com.fis.service.impl;

import vn.com.fis.service.Calculator;
import vn.com.fis.util.ValidateUtil;


//trường hợp d < 200
public class BadLocationCalcu extends Calculator{

	public BadLocationCalcu(int hp, int s, int d, String t) {
		super(hp, s, d, t);
	}

	@Override
	public double calculatorF() {
		if(!ValidateUtil.isFibonacci(this.getD() + this.getS())) {
			return 0;
		}
		return new GoodLocationCalcu(this.getHp(), this.getS(), this.getD(), this.getT()).calculatorF();
	}

}
