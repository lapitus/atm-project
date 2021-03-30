package com.lapitus.atmproject.interfaces;

import com.lapitus.atmproject.finance.Balance;

import java.util.Date;

public interface FinApi {
    Balance getBalance(String cardNo, Date cardExpireDate, int cardPin);
}
