package com.lapitus.atmproject.devices;

import Exceptions.BadCardNoException;
import Exceptions.BadRequestException;
import com.lapitus.atmproject.finance.Balance;
import com.lapitus.atmproject.interfaces.HostApi;
import com.lapitus.atmproject.request.RequestBalance;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Host implements HostApi {
    String hostAddress;
    static List<RequestBalance> requestList = new ArrayList<>();

    public Host(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public Balance getBalanceRequest(RequestBalance req) throws BadRequestException {

        String cardNo = req.getCardNo();
        int pin = req.getPin();
        Balance balance = new Balance();


        if (cardNo.equals("1111222233334444") && pin == 1234)  {
            balance.setAmount(3000);
            balance.setCurrency("RUR");
        } else if (cardNo.equals("1111222233335555") && pin == 1234) {
            balance.setAmount(1553);
            balance.setCurrency("USD");
        }

        if (requestList.size() > 0) {
            if (requestList.contains(req)) {
                throw new BadRequestException(req);
            }
        }

        requestList.add(req);
        return balance;

    }
}
