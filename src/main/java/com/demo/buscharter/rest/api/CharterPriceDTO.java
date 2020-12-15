package com.demo.buscharter.rest.api;

import java.util.List;

public class CharterPriceDTO {
    private List<PassengerTicketDTO> passengerTickets;
    private String totalPrice;
    private String totalPriceAfterTax;

    public CharterPriceDTO() {
    }

    public List<PassengerTicketDTO> getPassengerTickets() {
        return passengerTickets;
    }

    public void setPassengerTickets(List<PassengerTicketDTO> passengerTickets) {
        this.passengerTickets = passengerTickets;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPriceAfterTax() {
        return totalPriceAfterTax;
    }

    public void setTotalPriceAfterTax(String totalPriceAfterTax) {
        this.totalPriceAfterTax = totalPriceAfterTax;
    }
}
