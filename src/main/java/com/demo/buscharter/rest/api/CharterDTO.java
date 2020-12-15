package com.demo.buscharter.rest.api;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

public class CharterDTO {

    private BigDecimal basePrice;
    private int taxRate;
    private List<PassengerDTO> passengers;

    public CharterDTO() {
    }

    public CharterDTO(BigDecimal basePrice, int taxRate, List<PassengerDTO> passengers) {
        this.basePrice = basePrice;
        this.taxRate = taxRate;
        this.passengers = passengers;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerDTO> passengers) {
        this.passengers = passengers;
    }
}
