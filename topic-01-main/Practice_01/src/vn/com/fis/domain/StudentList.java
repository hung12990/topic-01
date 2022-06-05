package vn.com.fis.domain;

import java.util.Arrays;
import java.util.Comparator;

import vn.com.fis.model.Student;
import vn.com.fis.service.ISortStrategy;

public class StudentList {
	
	private Student[] students;
	
	private int count;
	
	private ISortStrategy iSortStrategy;
	
	
	public StudentList() {
		this.students = new Student[0];
		this.count = 0;
	}
	

	public void addStudent(Student student) {
		if(count == 100) return;
		students = Arrays.copyOf(students, ++count);
		students[count - 1] = student;
	}
	
	public Student removeStudent(int code) {
		int flag = -1;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getCode() == code) {
				flag = i;
			}
		}
		if(flag == -1) {
			return null;
		}else {
			Student std = students[flag];
			Student temp[] = new Student[students.length - 1];
			for(int i = 0, k = 0; i < students.length; i++) {
				if(i == flag) {
					continue;
				}else {
					temp[k++] = students[i];
				}
			}
			count--;
			students = temp;
			return std;
		}
	}
	
	public void display() {
		System.out.println("Danh sách sinh viên:");
		for(Student s: students) {
			System.out.println(s.toString());
		}
	}
	
	public void sort() {
		if(iSortStrategy == null) {
			return;
		}
		iSortStrategy.sort(students, count);
	}
	
	public void sort(Comparator<Student> cmp) {
		if(cmp == null) {
			return;
		}
		iSortStrategy.sort(students, cmp);
	}
	public void setSortStrategy(ISortStrategy iSortStrategy) {
		this.iSortStrategy = iSortStrategy;
	}
}
