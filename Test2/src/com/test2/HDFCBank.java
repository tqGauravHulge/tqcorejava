package com.test2;

import java.util.Scanner;

public class HDFCBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account a2 = new Account();

		System.out.println("Enter id:");
		a2.setId(sc.nextInt());
		System.out.println("Enter Account Number:");
		a2.setAccno(sc.nextInt());
		System.out.println("Enter Name:");
		a2.setName(sc.next());
		System.out.println("Enter Pancard:");
		a2.setPancard(sc.nextLong());
		System.out.println("Enter Debitcard:");
		a2.setDebitcard(sc.nextLong());
		System.out.println("Enter Balance:");
		a2.setBalance(sc.nextDouble());

		System.out.println("id:" + a2.getId());
		System.out.println("Account Number:" + a2.getAccno());
		System.out.println("Name:" + a2.getName());
		System.out.println("balance:" + a2.getBalance());
		if (a2.getBalance() >= 50000) {
			System.out.println("Pancard:" + a2.getPancard());
		}
		if (a2.getBalance() >= 25000) {
			System.out.println("Debitcard:" + a2.getDebitcard());
		}
		sc.close();

	}

}
