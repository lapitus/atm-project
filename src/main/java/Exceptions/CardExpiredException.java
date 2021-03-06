package Exceptions;

import java.util.Date;

public class CardExpiredException extends Exception {
    private Date cardExpireDate;
    private String cardNo;

    public CardExpiredException(Date cardExpireDate,String cardNo) {
        this.cardExpireDate = cardExpireDate;
        this.cardNo = cardNo;
    }

    @Override
    public String toString(){
        return ("Card: " + cardNo + " was expiring at " + cardExpireDate);
    }
}
