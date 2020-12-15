package com.demo.buscharter.service.mapper;

import com.demo.buscharter.domain.PassengerTicket;
import com.demo.buscharter.rest.api.PassengerTicketDTO;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.demo.buscharter.util.MoneyUtil.convertToCurrency;

@Service
public class PassangerTicketMapper {

    public List<PassengerTicketDTO> toRestListPassengerTicket(List<PassengerTicket> passengerTicketList) {
        return passengerTicketList == null ? Collections.emptyList()
                : passengerTicketList.stream().map(passenger -> {
            PassengerTicketDTO passengerTicketDTO = new PassengerTicketDTO();
            passengerTicketDTO.setPassengerDTO(passenger.getPassengerDTO());
            passengerTicketDTO.setPassengerPrice(convertToCurrency(passenger.getPassengerPrice(), "lv-LV"));
            passengerTicketDTO.setLuggagePrice(convertToCurrency(passenger.getLuggagePrice(), "lv-LV"));

            return passengerTicketDTO;
        }).collect(Collectors.toList());
    }
}
