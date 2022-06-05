package vn.com.fis.service.impl;

import vn.com.fis.service.ISortStrategy;

public class SelectionSortStrategy implements ISortStrategy{

	@Override
	public void sort(Comparable[] data, int count) {
		if(count > data.length) {
			count = data.length;
		}
		
		for(int i = 0; i < count - 1; i++) {
			int min = i;
			for(int j = i + 1; j < count; j++) {
				if(data[j].compareTo(data[min]) < 0) {
					min = j;
				}
			}
			if(min != i) {
				Comparable temp = data[i];
				 data[i] =  data[min];
				 data[min] = temp;
			}
		}
	}

}
