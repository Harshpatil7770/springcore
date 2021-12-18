package com.demo.springcore.db.propertyplaceholder;

public class MyDAO {

	private String dbServer;
	
	private int dbPort;
	
	private String dbUser;
	
	private String dbPass;

	public MyDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDAO(String dbServer, int dbPort, String dbUser, String dbPass) {
		super();
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	public int getDbPort() {
		return dbPort;
	}

	public void setDbPort(int dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}

	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}

	
}
