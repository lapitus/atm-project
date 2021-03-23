package com.lapitus.atmproject;

import com.lapitus.atmproject.devices.Atm;
import com.lapitus.atmproject.client.Client;
import com.lapitus.atmproject.finance.Balance;

import java.util.Calendar;
import java.util.Date;

public class GetBalanceTestDrive {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";

        String cardNo = "111222233334444";
        int pin = 12;

        Balance clientBalance;
        Date expireDate = new Date(121, Calendar.MARCH,24);
        Atm atm = new Atm();



        Client client1 = new Client(firstName,lastName,cardNo,pin,expireDate);
        clientBalance = client1.getBalance(atm);
        System.out.println(clientBalance.getAmount());

    }
}
