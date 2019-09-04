package com.avandal.cards.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private String message;

    public ServiceException(ExceptionEnum exceptionEnum, String message) {
        this.status = exceptionEnum.getStatus();
        this.message = message;
    }

    public ServiceException(ExceptionEnum exceptionEnum) {
        this(exceptionEnum, exceptionEnum.getMessage());
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}