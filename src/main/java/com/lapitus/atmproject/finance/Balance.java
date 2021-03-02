package com.lapitus.atmproject.finance;

import lombok.Getter;
import lombok.Setter;

public class Balance {
    @Getter @Setter private float amount;
    @Getter @Setter private int currency;

    public Balance() {
        this.amount = 0;
        this.currency = 0;
    }
}
