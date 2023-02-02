package com.test2;

import java.util.Scanner;

public class SBIBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account a1 = new Account();

		System.out.println("Enter id:");
		a1.setId(sc.nextInt());
		System.out.println("Enter Account Number:");
		a1.setAccno(sc.nextInt());
		System.out.println("Enter Name:");
		a1.setName(sc.next());
		System.out.println("Enter Pancard:");
		a1.setPancard(sc.nextLong());
		System.out.println("Enter Debitcard:");
		a1.setDebitcard(sc.nextLong());
		System.out.println("Enter Balance:");
		a1.setBalance(sc.nextDouble());

		System.out.println("id:" + a1.getId());
		System.out.println("Account Number:" + a1.getAccno());
		System.out.println("Name:" + a1.getName());
		System.out.println("balance:" + a1.getBalance());
		if (a1.getBalance() >= 50000) {
			System.out.println("Pancard:" + a1.getPancard());
		}
		if (a1.getBalance() >= 25000) {
			System.out.println("Debitcard:" + a1.getDebitcard());
		}
		sc.close();
	}
}
