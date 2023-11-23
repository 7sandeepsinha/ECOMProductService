package com.scaler.EcomProductService.exception;

public class InvalidTitleException extends RuntimeException{
    public InvalidTitleException() {
    }

    public InvalidTitleException(String message) {
        super(message);
    }
}
