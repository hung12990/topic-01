package vn.com.fis.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import vn.com.fis.model.Student;

public interface ISortStrategy {
	void sort(Comparable[] data, int count);
	
	default void sort(Student[] students, Comparator<Student> cmp) {
		Collections.sort(Arrays.asList(students), cmp);
	};
}
