package com.aoe.restapi.exception.handler;


import com.aoe.restapi.exception.exception.*;
import com.aoe.restapi.utility.status.OperationStatusError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {
    // built-in exceptions
    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<HashMap<String, Object>> MissingRequestHeaderException(MissingRequestHeaderException ex) {
        return new OperationStatusError(HttpStatus.BAD_REQUEST, ex.getMessage()).getResponseEntity();
    }

    // custom exceptions
    @ExceptionHandler(CommonException.class)
    public ResponseEntity<HashMap<String, Object>> handleCommonException(CommonException ex) {
        // todo change and remove that
        return new OperationStatusError(HttpStatus.TOO_MANY_REQUESTS, ex.getMessage()).getResponseEntity();
    }

}