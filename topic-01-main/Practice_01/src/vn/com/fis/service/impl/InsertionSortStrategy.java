package vn.com.fis.service.impl;

import vn.com.fis.model.Student;
import vn.com.fis.service.ISortStrategy;

public class InsertionSortStrategy  implements ISortStrategy{

	@Override
	public void sort(Comparable[] data, int count) {
		if(count > data.length) {
			count = data.length;
		}
		for(int i = 1; i < count; i++) {
			Comparable comp = data[i];
			int j = i - 1;
			while(j >= 0 && data[j].compareTo(comp) > 0) {
				data[j+1] = data[j];
				j = j - 1;
			}
			data[j + 1] = comp;
		}
	}
	
}
