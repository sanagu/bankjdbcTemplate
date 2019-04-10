package com.capgemini.bank.exception;

public class BankAccountNotFoundException extends Exception {
	
	public BankAccountNotFoundException() {
		super();
	}

	public BankAccountNotFoundException(String message) {
		super(message);
	}

}
