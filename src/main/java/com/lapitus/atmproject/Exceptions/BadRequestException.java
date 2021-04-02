package com.lapitus.atmproject.Exceptions;

import com.lapitus.atmproject.request.RequestBalance;

public class BadRequestException extends Exception {
    private RequestBalance req;

    public BadRequestException(RequestBalance req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "Error! Request for card " + req.getCardNo() + " already processed!";
    }

    @Override
    public String getMessage() {
        return toString();
    }

}
