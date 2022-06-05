package vn.com.fis.service.impl;

import vn.com.fis.service.ISortStrategy;

public class BubbleSortStrategy implements ISortStrategy{

	@Override
	public void sort(Comparable[] data, int count) {
		if(count > data.length) {
			count = data.length;
		}
		for(int i = 0; i < count - 1; i++) {
			for(int j = 0; j < count - i - 1; j++) {
				if(data[j].compareTo(data[j + 1]) > 0) {
					Comparable temp = data[j];
					 data[j] =  data[j + 1];
					 data[j + 1] = temp;
				}
			}
		}
	}

}
