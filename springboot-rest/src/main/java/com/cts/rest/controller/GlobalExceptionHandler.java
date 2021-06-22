package com.cts.rest.controller;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cts.rest.exception.UserNotFoundException;
import com.cts.rest.model.ui.response.ErrorMessage;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex,WebRequest request){
		String errorMessageDescription=ex.getLocalizedMessage();
		if(errorMessageDescription==null) errorMessageDescription.toString();
		ErrorMessage errorMessage=new ErrorMessage(new Date(),errorMessageDescription);
		return new ResponseEntity<>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= {UserNotFoundException.class})
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex,HttpHeaders headers, HttpStatus status, WebRequest request){
		String errorMessageDescription=ex.getLocalizedMessage();
		if(errorMessageDescription==null)errorMessageDescription.toString();
		ErrorMessage errorMessage=new ErrorMessage(new Date(),errorMessageDescription);
		return new ResponseEntity<>(errorMessage,headers,status);
	}
}
