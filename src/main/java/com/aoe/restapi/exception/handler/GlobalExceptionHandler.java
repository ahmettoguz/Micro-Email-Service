package com.aoe.restapi.exception.handler;


import com.aoe.restapi.exception.exception.InvalidInputException;
import com.aoe.restapi.utility.status.OperationStatusError;
import jakarta.mail.MessagingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {
    // built-in exceptions
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<HashMap<String, Object>> HttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return new OperationStatusError(HttpStatus.BAD_REQUEST, "Request body is missing").getResponseEntity();
    }

    @ExceptionHandler(MessagingException.class)
    public ResponseEntity<HashMap<String, Object>> MessagingException(MessagingException ex) {
        return new OperationStatusError(HttpStatus.BAD_REQUEST, ex.getMessage()).getResponseEntity();
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<HashMap<String, Object>> MissingRequestHeaderException(MissingRequestHeaderException ex) {
        return new OperationStatusError(HttpStatus.BAD_REQUEST, ex.getMessage()).getResponseEntity();
    }

    // custom exceptions
    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<HashMap<String, Object>> handleInvalidInputException(InvalidInputException ex) {
        return new OperationStatusError(HttpStatus.BAD_REQUEST, ex.getMessage()).getResponseEntity();
    }
}