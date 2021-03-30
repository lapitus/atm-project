package com.lapitus.atmproject.client;

import com.lapitus.atmproject.finance.Balance;

import java.util.Date;

import com.lapitus.atmproject.interfaces.FinApi;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private String firstName;
    private String lastName;
    private String cardNo;
    private int cardPin;
    private Date cardExpireDate;
    private Balance balance;


    public Client(String firstName, String lastName, String cardNo, int cardPin, Date expireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNo = cardNo;
        this.cardPin = cardPin;
        this.cardExpireDate = expireDate;
    }

    public Balance getBalance(FinApi atm) {
        return atm.getBalance(cardNo,cardExpireDate,cardPin);
    }
}
