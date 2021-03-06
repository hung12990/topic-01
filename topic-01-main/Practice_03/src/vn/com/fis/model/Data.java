package vn.com.fis.model;

import java.text.DecimalFormat;

import vn.com.fis.service.Calculator;
import vn.com.fis.service.impl.BadLocationCalcu;
import vn.com.fis.service.impl.GoodLocationCalcu;
import vn.com.fis.service.impl.HardLocationCalcu;
import vn.com.fis.service.impl.SpecicalLocationCalcu;

public class Data {
	
	Calculator calculator;
	
	public Data() {
	}
	
	public Data(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	//public method

	public double predict() {
		if(!isValid(calculator)) {
			return -1;
		}
		double p1 = 0.0, p2 = 0.0, f = 0.0;
		p1 = this.calculator.calculatorP()[0];
		p2 = this.calculator.calculatorP()[1];
		f = this.calculator.calculatorF();
		double result = (p1 + p2 * f)/(1000 + Math.abs(p2 * f));
		if(result < 0) {
			return 0;
		}else if(result > 1) {
			return 1;
		}else {
			return result;
		}
	}
	
	public boolean isValid(Calculator calculator) {
		if(calculator.getHp() < 1 || calculator.getHp() > 999) {
			return false;
		}else if(calculator.getD() < 1 || calculator.getD() > 1000) {
			return false;
		}else if(calculator.getS() < 1 || calculator.getS() > 100) {
			return false;
		}
		return true;
	}
}
