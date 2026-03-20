package com.aiteam.fintech.common.exceptions;

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String errorMessage) {
        super(errorMessage);
    }
}
