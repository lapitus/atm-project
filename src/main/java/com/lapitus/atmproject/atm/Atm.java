package com.lapitus.atmproject.atm;

import com.lapitus.atmproject.client.Client;
import com.lapitus.atmproject.finance.Balance;
import java.util.Date;

public class Atm {
    private Balance balance;

    public Balance getBalance(Client client) {
        Balance balance = new Balance();
        if (client.getCardNo() == 12345 && client.getPin() == 12) {
            balance.setAmount(800);
            balance.setCurrency(840);
        } else {
            balance.setAmount(0);
            balance.setCurrency(0);
        }
        return balance;
    }
}
