package vn.com.fis.service.impl;

import vn.com.fis.service.Calculator;


//trường hợp 200 <= d < 300
public class SpecicalLocationCalcu extends Calculator{
	
	public SpecicalLocationCalcu(int hp, int s, int d, String t) {
		super(hp, s, d, t);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double calculatorF() {
		double index = snake();
		if(index > 0.8) {
			return 0;
		}else {
			GoodLocationCalcu g = new GoodLocationCalcu(this.getHp(), this.getS(), this.getD(), this.getT());
			if(index > 0.6) {
				g.setHp(this.getHp() - 50);
				return g.calculatorF();
			}else if(index > 0.4) {
				g.setHp(this.getHp() - 30);
				return g.calculatorF();
			}else if(index > 0.2) {
				g.setHp(this.getHp() - 20);
				return g.calculatorF();
			}else{
				return g.calculatorF();
			}
		}
	}
	//tính tỉ lệ bị rắn cắn
	public double snake() {
		int[] p = this.calculatorP();
		return (this.getD() + p[0] + p[1])/1000.0;
	}
}

