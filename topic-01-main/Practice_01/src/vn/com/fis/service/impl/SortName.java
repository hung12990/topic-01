package vn.com.fis.service.impl;

import java.util.Comparator;

import vn.com.fis.model.Student;

public class SortName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
