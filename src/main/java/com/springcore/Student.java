package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setting student id");
		this.studentId = studentId;
	}

	public Student(int studentId, String studentName, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		this.studentName = studentName;
	}

	public String getAddress() {
		
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setting student address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
}
