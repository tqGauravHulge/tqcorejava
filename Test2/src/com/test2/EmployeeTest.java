package com.test2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(102, "Gaurav", 45000, 26);
		e1.display();

		Employee e2 = new Employee(103, "Apurva", 45000, 21, 2);
		e2.display();

		Employee e3 = new Employee();
		e3.display();

	}

}
