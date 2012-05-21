package com.prashant;

public class Ticket {

	String description;
	String user;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Ticket [description=" + description + ", user=" + user + "]";
	}

}
