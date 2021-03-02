package com.lapitus.atmproject.client;

import com.lapitus.atmproject.finance.Balance;

import java.util.Date;

public class Client {
    private String firstName;
    private String lastName;
    private int cardNo;
    private int pin;
    private Date expireDate;
    Balance balance;

    public Client(String firstName, String lastName, int cardNo, int pin, Date expireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNo = cardNo;
        this.pin = pin;
        this.expireDate = expireDate;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Balance getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
