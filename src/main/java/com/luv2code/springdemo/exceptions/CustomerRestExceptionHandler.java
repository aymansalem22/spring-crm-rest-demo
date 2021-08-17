package com.luv2code.springdemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	//add an exception handler for customernotfoundexception
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc){
		//create customererrorresponse
		
		CustomerErrorResponse error=new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis());
				
		//return response entity
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	
	//add another exception handler...to catch any exception(Catch all)
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception ex){
		//create customererrorresponse
		
		CustomerErrorResponse error=new CustomerErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				ex.getMessage(),
				System.currentTimeMillis());
				
		//return response entity
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	
	
}
