package com.lapitus.atmproject.client;

import com.lapitus.atmproject.finance.Balance;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private int cardNo;
    @Getter @Setter private int cardPin;
    @Getter @Setter private Date cardExpireDate;
    @Getter @Setter Balance balance;


    public Client(String firstName, String lastName, int cardNo, int cardPin, Date expireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNo = cardNo;
        this.cardPin = cardPin;
        this.cardExpireDate = expireDate;
    }
}
