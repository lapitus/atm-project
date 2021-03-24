package Exceptions;

import com.lapitus.atmproject.request.RequestBalance;

public class BadRequestException extends Exception{
    private RequestBalance req;

    public BadRequestException(RequestBalance req) {
        this.req = req;
    }

    public String toString() {
        return "Error! Request for card " + req.getCardNo() + " already processed!";
    }

}
