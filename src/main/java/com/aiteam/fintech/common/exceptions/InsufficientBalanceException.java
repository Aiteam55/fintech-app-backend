package com.aiteam.fintech.common.exceptions;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String errorMessage) {
        super(errorMessage);
    }
}
