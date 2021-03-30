package com.lapitus.atmproject.interfaces;

import Exceptions.BadRequestException;
import com.lapitus.atmproject.finance.Balance;
import com.lapitus.atmproject.request.RequestBalance;

public interface HostApi {
    Balance getBalanceRequest(RequestBalance req) throws BadRequestException;
}
