package com.lapitus.atmproject.Exceptions;

import java.time.LocalDate;

public class CardExpiredException extends Exception {
    private LocalDate cardExpireDate;
    private String cardNo;

    public CardExpiredException(LocalDate cardExpireDate, String cardNo) {
        this.cardExpireDate = cardExpireDate;
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return ("Card: " + cardNo + " was expiring at " + cardExpireDate);
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
