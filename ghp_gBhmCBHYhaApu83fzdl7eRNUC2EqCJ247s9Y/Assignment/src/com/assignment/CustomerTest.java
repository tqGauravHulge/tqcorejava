package com.assignment;

import java.util.Scanner;

public class CustomerTest {

	public static void enterItemDetails(Customer c) {

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Customer c1 = new Customer();
		Customer c2 = new Customer(101, "Sagar", "4569871230");
		Customer c3 = new Customer(102, "Adinath", "7867545680", "DellLaptop", 78000.60f, "FullPaid");

		int choice;
		System.out.println("------------------------------------------------");

		// for customer
		System.out.println("Enter the id:");
		c1.setCid(sc.nextInt());
		System.out.println("Enter the Name:");
		c1.setName(sc.next());
		System.out.println("Enter the Phone Number:");
		c1.setPhoneNumber(sc.next());
		System.out.println("Do you want to purchase item:");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter Item Name:");
			c1.setItemName(sc.next());
			System.out.println("Enter the price:");
			c1.setPrice(sc.nextFloat());
			System.out.println("Enter the payment details:");
			c1.setStatus(sc.next());
		}

		// for customer 2
		System.out.println(c2);
		System.out.println("Do you want to purchase item:");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter Item Name:");
			c2.setItemName(sc.next());
			System.out.println("Enter the price:");
			c2.setPrice(sc.nextFloat());
			System.out.println("Enter the payment details:");
			c2.setStatus(sc.next());
		}

		System.out.println("---------------------------");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		sc.close();
	}
}
