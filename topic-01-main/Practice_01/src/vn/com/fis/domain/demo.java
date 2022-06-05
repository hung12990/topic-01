package vn.com.fis.domain;

import java.util.Date;

import vn.com.fis.model.Student;
import vn.com.fis.service.impl.BubbleSortStrategy;
import vn.com.fis.service.impl.InsertionSortStrategy;
import vn.com.fis.service.impl.SelectionSortStrategy;
import vn.com.fis.service.impl.SortDate;
import vn.com.fis.service.impl.SortName;

public class demo {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		studentList.addStudent(new Student(1, "Tann", new Date()));
		studentList.addStudent(new Student(5, "Minh", new Date(new Date().getTime() - 5000000000L)));
		studentList.addStudent(new Student(3, "Dai", new Date(new Date().getTime() - 3000000000L)));
		studentList.addStudent(new Student(4, "Tuan", new Date(new Date().getTime() - 7000000000L)));
		studentList.addStudent(new Student(2, "Ngoc", new Date(new Date().getTime() - 1100000000L)));
		studentList.setSortStrategy(new SelectionSortStrategy());
		studentList.sort(new SortDate());
		studentList.display();
	}
}
