package com.assignment;

public class Person {
	private int pid;
	private String name;
	private int age;
	private String vote;

	public Person() {
		System.out.println("default constructor:");
	}

	public Person(int pid, String name, int age) {
		System.out.println("Parameterised constructor:");
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.vote = "null";
	}

	public void getVoteRight() {
		this.checkVote();
		System.out.println(this.name + "  vote:" + this.vote);
	}

	public void checkVote() {
		if (this.age >= 18)
			this.vote = "Eligible";
		else
			this.vote = "Not eligible";
	}
}
