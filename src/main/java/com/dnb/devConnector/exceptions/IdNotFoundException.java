package com.dnb.devConnector.exceptions;

public class IdNotFoundException extends Exception{
	
	public IdNotFoundException(String msg) {
		super(msg);
	}
	
	public String toString() {
		return super.getMessage()+super.toString();
	}
	
}
