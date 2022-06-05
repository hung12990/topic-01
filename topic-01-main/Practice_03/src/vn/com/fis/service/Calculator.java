package vn.com.fis.service;

import vn.com.fis.util.ValidateUtil;

public abstract class Calculator {
	private int hp;
	private int s;
	private int d;
	private String t;
	
	
	public Calculator(int hp, int d, int s, String t) {
		this.hp = hp;
		this.s = s;
		this.d = d;
		this.t = t;
	}
	
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getS() {
		return s;
	}


	public void setS(int s) {
		this.s = s;
	}


	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}


	public String getT() {
		return t;
	}


	public void setT(String t) {
		this.t = t;
	}


	public int[] calculatorP() {
		int[] p = new int[2];
		if(ValidateUtil.isPrime(this.hp)) {
			p[0] = 1000;
			p[1] = (this.hp + this.s) % 1000;
		}else {
			p[0] = this.hp;
			p[1] = (this.hp + this.d) % 100;
		}
		return p;
	};
	public abstract double calculatorF();
}
