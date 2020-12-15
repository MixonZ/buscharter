package com.demo.buscharter.rest.api;

public class PassengerTicketDTO {
    private PassengerDTO passengerDTO;
    private String passengerPrice;
    private String luggagePrice;

    public PassengerTicketDTO() {
    }

    public PassengerTicketDTO(PassengerDTO passengerDTO, String passengerPrice, String luggagePrice) {
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

    public String getPassengerPrice() {
        return passengerPrice;
    }

    public void setPassengerPrice(String passengerPrice) {
        this.passengerPrice = passengerPrice;
    }

    public String getLuggagePrice() {
        return luggagePrice;
    }

    public void setLuggagePrice(String luggagePrice) {
        this.luggagePrice = luggagePrice;
    }

}
