package com.aiteam.fintech.common.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
