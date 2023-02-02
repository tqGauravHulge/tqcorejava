package com.test2;

public class Employee {
	private int empid;
	private String empName;
	private double salary;
	private int age;
	private int experience;

	public Employee() {
		System.out.println("Default Constructor:");
	}

	public Employee(int empid, String empName, double salary, int age) {
		System.out.println("Parameterized constructor 1:");
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.experience = 0;
	}

	public Employee(int empid, String empName, double salary, int age, int experience) {
		System.out.println("Parameterized constructor 2:");
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.experience = experience;
	}

	public void display() {
		System.out.println(empid + " " + empName + " " + salary + " " + age + " " + experience);
	}
}
