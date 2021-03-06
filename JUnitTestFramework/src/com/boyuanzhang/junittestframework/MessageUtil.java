package com.boyuanzhang.junittestframework;

/*
* This class prints the given message on console.
*/

public class MessageUtil {

	private String message;

	// Constructor
	// @param message to be printed

	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

	public Object salutationMessage() {
		message = "Hi! " + message;
		return message;
	}
}