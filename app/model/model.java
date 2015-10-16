package com.pack.bluemaple.app.model;

public class model {
	private int userId;
	private String userName;
	private String password;
	private String email;
	private String contact;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return " [" + userId + " , " + userName + ", " + password + ", " + email
				+ ", " + contact + "]";
	}

	// @Override
	// public String toString() {
	// return "model [userId=" + userId + ", userName=" + userName
	// + ", password=" + password + ", email=" + email + ", contact="
	// + contact + "]";

}
