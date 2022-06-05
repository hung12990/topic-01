package vn.com.fis.service.impl;

import java.util.Comparator;

import vn.com.fis.model.Student;

public class SortDate implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getBirthDate().compareTo(o2.getBirthDate());
	}

}
