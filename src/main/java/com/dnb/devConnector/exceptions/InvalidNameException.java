package com.dnb.devConnector.exceptions;

public class InvalidNameException extends Exception{

	public InvalidNameException(String msg) {
		super(msg);
	}

	public String toString() {
		return super.toString()+ super.getMessage();
	}
	
}
