package com.demo.buscharter.domain;


import java.math.BigDecimal;

public enum PassengerType {
    CHILD(new BigDecimal("0.5")),
    ADULT(new BigDecimal("1"));

    private final BigDecimal priceModifier;

    PassengerType(BigDecimal priceModifier) {
        this.priceModifier = priceModifier;
    }

    public BigDecimal getPriceModifier() {
        return priceModifier;
    }
}
