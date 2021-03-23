package com.lapitus.atmproject.fininterface;

import com.lapitus.atmproject.finance.Balance;

import java.util.Date;

public interface Finapi {
    Balance getBalance(String cardNo, Date cardExpireDate, int cardPin);
}
