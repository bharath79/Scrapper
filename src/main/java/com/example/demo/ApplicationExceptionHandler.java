package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {


    @ExceptionHandler(value = ApplicationException.class)
    public ResponseEntity<String> applicationException(ApplicationException exception){
        HttpStatus status= HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(MethodUtils.prepareErrorJSON(status,exception),status);
    }

}
