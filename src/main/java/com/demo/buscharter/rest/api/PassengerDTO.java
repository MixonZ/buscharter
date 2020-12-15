package com.demo.buscharter.rest.api;

import com.demo.buscharter.domain.PassengerType;

public class PassengerDTO {

    private PassengerType passengerType;
    private int luggageCount = 0;

    public PassengerDTO(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public PassengerDTO(PassengerType passengerType, int luggageCount) {
        this.passengerType = passengerType;
        this.luggageCount = luggageCount;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }
}
