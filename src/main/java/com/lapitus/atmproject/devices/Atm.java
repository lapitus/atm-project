package com.lapitus.atmproject.devices;

import com.lapitus.atmproject.Exceptions.BadCardNoException;
import com.lapitus.atmproject.Exceptions.BadPinException;
import com.lapitus.atmproject.Exceptions.BadRequestException;
import com.lapitus.atmproject.Exceptions.CardExpiredException;
import com.lapitus.atmproject.finance.Balance;
import com.lapitus.atmproject.interfaces.FinApi;
import com.lapitus.atmproject.request.RequestBalance;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Atm implements FinApi {

    public Balance getBalance(String cardNo, LocalDate cardExpireDate, int cardPin) {


        Balance balance;
        //validate params
        try {
            validateParams(cardNo, cardPin, cardExpireDate);
        } catch (BadCardNoException | BadPinException | CardExpiredException e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new RuntimeException();
        }

        //sendRequest to host
        Host host = new Host("127.0.0.1");
        RequestBalance req = new RequestBalance(cardNo, cardPin);
        balance = sendMessageToHost(host, req);
        
        return balance;
    }

    private void validateParams(String cardNo, int cardPin, LocalDate cardExpireDate) throws BadCardNoException, BadPinException, CardExpiredException {
        LocalDate currentDate = LocalDate.now();

        if (!cardNo.matches("^[0-9]{16}$")) {
            throw new BadCardNoException(cardNo);
        }

        if (cardPin % 2 != 0) {
            throw new BadPinException(cardPin);
        }

        if (cardExpireDate.isBefore(currentDate)) {
            throw new CardExpiredException(cardExpireDate, cardNo);
        }
    }

    private Balance sendMessageToHost(Host host, RequestBalance req) {

        try {
            return host.getBalanceRequest(req);
        } catch (BadRequestException e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new RuntimeException();
        }
    }
}
