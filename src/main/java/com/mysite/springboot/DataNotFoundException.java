package com.mysite.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity id not found")
public class DataNotFoundException extends RuntimeException{
    private static final long serialVersionUid = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
