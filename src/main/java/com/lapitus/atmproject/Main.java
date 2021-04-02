package com.lapitus.atmproject;

import com.lapitus.atmproject.devices.Atm;
import com.lapitus.atmproject.client.Client;
import com.lapitus.atmproject.finance.Balance;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";

        String cardNo = "1111222233335555";
        String cardNo2 = "1111222233334444";
        int pin = 1234;

        Balance clientBalance;
        LocalDate expireDate = LocalDate.of(2021,4,1);

        Atm atm = new Atm();

        Client client1 = new Client(firstName, lastName, cardNo, pin, expireDate);
        clientBalance = client1.getBalance(atm);
        System.out.println("Client1 balance = " + clientBalance.getAmount());

        Client client2 = new Client(firstName, lastName, cardNo2, pin, expireDate);
        clientBalance = client2.getBalance(atm);
        System.out.println("Client2 balance = " + clientBalance.getAmount());

        clientBalance = client1.getBalance(atm);
        System.out.println("Client1 balance = " + clientBalance.getAmount());

    }
}
