package com.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {
@ExceptionHandler(ProductNotFoundException.class)
public ResponseEntity<Object> ProductException() {
	return new ResponseEntity<>("This product is not in the List",HttpStatus.BAD_REQUEST);
}
}
