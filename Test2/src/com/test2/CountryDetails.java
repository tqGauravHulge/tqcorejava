package com.test2;

import java.util.Scanner;

public class CountryDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the country name:");
		String ch = sc.next();

		switch (ch) {
		case "India":
			System.out.println("Pincode: 414203");
			System.out.println("Capital: NEW DELHI");
			System.out.println("Area: 541346");
			break;

		case "Shrilanka":
			System.out.println("Pincode: 414204");
			System.out.println("Capital: COLOMBO");
			System.out.println("Area: 54564");
			break;

		case "South Afrika":
			System.out.println("Pincode: 414206");
			System.out.println("Capital: CAPE TOWN");
			System.out.println("Area: 454567");
			break;

		case "New Zealand":
			System.out.println("Pincode: 414205");
			System.out.println("Capital: WELLINGTON");
			System.out.println("Area: 446125");
			break;

		case "Australia":
			System.out.println("Pincode: 414207");
			System.out.println("Capital: CANBERRA");
			System.out.println("Area: 55212");
			break;

		case "England":
			System.out.println("Pincode: 414208");
			System.out.println("Capital: BOSTON");
			System.out.println("Area: 51541");
			break;

		case "China":
			System.out.println("PinCode: 414203");
			System.out.println("Capital: BEIJING");
			System.out.println("Area: 45215");
			break;

		case "Japan":
			System.out.println("Pincode: 414203");
			System.out.println("Capital: TOKYO");
			System.out.println("Area: 41111");
			break;

		case "Russia":
			System.out.println("Pincode: 414203");
			System.out.println("CApital: Moscow");
			System.out.println("Area: 44541");
			break;

		case "Germany":
			System.out.println("Pincode: 414203");
			System.out.println("capital: Berlin");
			System.out.println("Area: 12412");
			break;

		default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
