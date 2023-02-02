package com.test2;

public class Account {
	private int id;
	private long accno;
	private String name;
	private long pancard;
	private long debitcard;
	private double balance;

	public Account() {
		System.out.println("default constructor:");
	}

	public Account(int id, long accno, String name, long pancard, long debitcard, double balance) {
		System.out.println("Parameterized constructor:");
		this.id = id;
		this.accno = accno;
		this.name = name;
		this.pancard = pancard;
		this.debitcard = debitcard;
		this.balance = balance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public long getAccno() {
		return accno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPancard(long pancard) {
		this.pancard = pancard;
	}

	public long getPancard() {
		return pancard;
	}

	public void setDebitcard(long debitcard) {
		this.debitcard = debitcard;
	}

	public long getDebitcard() {
		return debitcard;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account Details" + id + " " + accno + " " + name + " " + pancard + " " + debitcard;
	}
}
