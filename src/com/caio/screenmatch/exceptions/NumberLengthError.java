package com.caio.screenmatch.exceptions;

public class NumberLengthError extends RuntimeException {
    String message;

    public NumberLengthError(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
