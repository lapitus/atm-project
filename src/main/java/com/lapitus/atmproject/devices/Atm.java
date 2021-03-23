package com.lapitus.atmproject.devices;

import Exceptions.BadCardNoException;
import Exceptions.BadPinException;
import Exceptions.CardExpiredException;
import com.lapitus.atmproject.finance.Balance;
import com.lapitus.atmproject.fininterface.Finapi;

import java.util.Date;

public class Atm implements Finapi {

    public Balance getBalance(String cardNo, Date cardExpireDate, int cardPin) {

        //validate params

        Balance balance = new Balance(100,"USD");

        try {
            validateParams(cardNo,cardPin,cardExpireDate);
        } catch (BadCardNoException | BadPinException | CardExpiredException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

        //sendMessageToHost


        return balance;
    }

    private void  validateParams (String cardNo, int cardPin,Date cardExpireDate) throws BadCardNoException,BadPinException, CardExpiredException {
        Date currentDate =  new Date();

        if (!cardNo.matches("^[0-9]{16}$")) {
            throw new BadCardNoException(cardNo);
        }

        if (cardPin % 2 != 0) {
            throw new BadPinException(cardPin);
        }

        if (cardExpireDate.before(currentDate)) {
            throw new CardExpiredException(cardExpireDate,cardNo);
        }
    }


}
