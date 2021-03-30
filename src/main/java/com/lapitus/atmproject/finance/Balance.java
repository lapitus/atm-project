package com.lapitus.atmproject.finance;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Balance {
     private float amount;
     private String currency;

    public Balance() {
        this.amount = 0;
        this.currency = "RUR";
    }

    public Balance(float amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
