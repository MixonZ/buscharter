package com.demo.buscharter.domain;

import com.demo.buscharter.rest.api.PassengerDTO;

import java.math.BigDecimal;

public class PassengerTicket {
    private PassengerDTO passengerDTO;
    private BigDecimal passengerPrice;
    private BigDecimal luggagePrice;

    public PassengerTicket(PassengerDTO passengerDTO, BigDecimal passengerPrice, BigDecimal luggagePrice) {
        this.passengerDTO = passengerDTO;
        this.passengerPrice = passengerPrice;
        this.luggagePrice = luggagePrice;
    }

    public PassengerDTO getPassengerDTO() {
        return passengerDTO;
    }

    public void setPassengerDTO(PassengerDTO passengerDTO) {
        this.passengerDTO = passengerDTO;
    }

    public BigDecimal getPassengerPrice() {
        return passengerPrice;
    }

    public void setPassengerPrice(BigDecimal passengerPrice) {
        this.passengerPrice = passengerPrice;
    }

    public BigDecimal getLuggagePrice() {
        return luggagePrice;
    }

    public void setLuggagePrice(BigDecimal luggagePrice) {
        this.luggagePrice = luggagePrice;
    }

}
