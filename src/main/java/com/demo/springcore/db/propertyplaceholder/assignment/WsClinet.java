package com.demo.springcore.db.propertyplaceholder.assignment;

public class WsClinet {

	private String url;
	
	private String userName;
	
	private String password;

	public WsClinet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WsClinet(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "WsClinet [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
