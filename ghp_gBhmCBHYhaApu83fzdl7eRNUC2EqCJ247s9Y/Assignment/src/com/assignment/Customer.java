package com.assignment;

public class Customer {
	private int cid;
	private String name;
	private String itemName;
	private float price;
	private String status;
	private String phoneNumber;

	// default constructor
	public Customer() {
		System.out.println("In default constructor");
		this.itemName = null;
		this.status = "unknown";
		this.price = 0.0f;
	}

	public Customer(int cid, String name, String phoneNumber) {
		this();
		System.out.println("In parameterized constructor 1:");
		this.cid = cid;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Customer(int cid, String name, String phoneNumber, String itemName, float price, String status) {
		this(cid, name, phoneNumber);
		System.out.println("In parameterized constructor 2:");
		this.itemName = itemName;
		this.price = price;
		this.status = status;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public String toString() {
		return cid + " " + name + " " + phoneNumber + " " + itemName + " " + price + " " + status;
	}
}