package vn.com.fis.domain;

import vn.com.fis.model.Data;
import vn.com.fis.model.Info;
import vn.com.fis.service.Calculator;

public class MainApplication {
	public static void main(String[] args) {
		Info info = new Info(657, 844, 100, "Flood");
		System.out.println(new Data(info.getCalculator()).predict());
	}
}
