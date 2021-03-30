package com.lapitus.atmproject.interfaces;

import com.lapitus.atmproject.finance.Balance;

import java.time.LocalDate;

public interface FinApi {
    Balance getBalance(String cardNo, LocalDate cardExpireDate, int cardPin);
}
