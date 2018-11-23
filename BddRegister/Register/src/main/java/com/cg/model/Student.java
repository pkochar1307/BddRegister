package com.cg.model;

public class Student {

	private String studentName;
	private int StudentAge;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", StudentAge=" + StudentAge + "]";
	}
	public Student(String studentName, int studentAge) {
		super();
		this.studentName = studentName;
		StudentAge = studentAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}