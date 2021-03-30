package com.lapitus.atmproject.request;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
public class RequestBalance {
    private String cardNo;
    private int pin;

    public RequestBalance(String cardNo, int pin){
        this.cardNo = cardNo;
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestBalance that = (RequestBalance) o;
        return pin == that.pin &&
                Objects.equals(cardNo, that.cardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNo, pin);
    }
}
