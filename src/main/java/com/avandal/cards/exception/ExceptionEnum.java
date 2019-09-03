package com.avandal.cards.exception;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
    INVALID_PARAMETERS(HttpStatus.BAD_REQUEST, "Invalid parameters."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "An internal error occured.");

    private HttpStatus status;
    private String message;

    private ExceptionEnum(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}