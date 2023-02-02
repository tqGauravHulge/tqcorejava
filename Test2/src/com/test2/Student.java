package com.test2;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private float marks;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Float getMarks() {
		return marks;
	}

	public String toString() {
		return "Student details:" + id + " " + name + " " + marks;
	}

	public void getdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id:");
		this.id = sc.nextInt();

		System.out.println("Enter Student Name:");
		this.name = sc.next();

		System.out.println("Enter the marks:");
		this.marks = sc.nextFloat();
		sc.close();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getdetails();

		Student s2 = new Student();
		s2.getdetails();

		Student s3 = new Student();
		s3.getdetails();

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
