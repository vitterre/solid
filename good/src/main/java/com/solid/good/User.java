package com.solid.good;

import java.util.UUID;

public class User {
	private final String id;
	private final String username;
	private int age;

	public User(String username, int age) {
		this.id = UUID.randomUUID().toString();
		this.username = username;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFriendOf(final User user) {
		// ...
		return false;
	}
}
