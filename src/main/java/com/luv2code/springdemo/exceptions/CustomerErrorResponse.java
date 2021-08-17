package com.luv2code.springdemo.exceptions;

public class CustomerErrorResponse {
private int status;
private String message;
private long timeStamp;
//explain below

public CustomerErrorResponse() {
}


public CustomerErrorResponse(int status, String message, long timeStamp) {
	this.status = status;
	this.message = message;
	this.timeStamp = timeStamp;
}


public int getStatus() {
	return status;
}


public void setStatus(int status) {
	this.status = status;
}


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public long getTimeStamp() {
	return timeStamp;
}


public void setTimeStamp(long timeStamp) {
	this.timeStamp = timeStamp;
}





}


/*498:video exception
 * 1-create a custom error response class
 * 2-create a custom error exception class
 * 3-update rest service to throw exception if customer not found
 * 4-add an exception handler methods using @exceptionhandler//class glopal advice
 */