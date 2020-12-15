package com.demo.buscharter.domain;

import java.math.BigDecimal;
import java.util.List;

public class CharterPrice {

    private List<PassengerTicket> passengerTickets;
    private BigDecimal totalPrice;
    private BigDecimal totalPriceAfterTax;

    public CharterPrice(List<PassengerTicket> passengerTickets, BigDecimal totalPrice, BigDecimal totalPriceAfterTax) {
        this.passengerTickets = passengerTickets;
        this.totalPrice = totalPrice;
        this.totalPriceAfterTax = totalPriceAfterTax;
    }

    public List<PassengerTicket> getPassengerTickets() {
        return passengerTickets;
    }

    public void setPassengerTickets(List<PassengerTicket> passengerTickets) {
        this.passengerTickets = passengerTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPriceAfterTax() {
        return totalPriceAfterTax;
    }

    public void setTotalPriceAfterTax(BigDecimal totalPriceAfterTax) {
        this.totalPriceAfterTax = totalPriceAfterTax;
    }
}
