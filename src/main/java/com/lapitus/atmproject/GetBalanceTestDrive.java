package com.lapitus.atmproject;

import com.lapitus.atmproject.atm.Atm;
import com.lapitus.atmproject.client.Client;
import com.lapitus.atmproject.finance.Balance;

import java.util.Date;

public class GetBalanceTestDrive {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";

        int cardNo = 12345;
        int pin = 12;

        Balance clientBalance;
        Date expireDate = new Date();
        Atm atm = new Atm();

        Client client1 = new Client(firstName,lastName,cardNo,pin,expireDate);
        client1.setBalance(atm.getBalance(client1));
        clientBalance = client1.getBalance();
        System.out.println("Client " + client1.getFirstName() + " balance = " + clientBalance.getAmount() + " " + clientBalance.getCurrency());


    }
}
