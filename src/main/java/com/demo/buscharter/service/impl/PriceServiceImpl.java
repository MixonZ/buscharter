package com.demo.buscharter.service.impl;

import com.demo.buscharter.domain.CharterPrice;
import com.demo.buscharter.domain.Constants;
import com.demo.buscharter.domain.PassengerTicket;
import com.demo.buscharter.domain.PassengerType;
import com.demo.buscharter.rest.api.*;
import com.demo.buscharter.service.PriceService;
import com.demo.buscharter.util.MoneyUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Override
    public CharterPrice getTicketPriceForCharter(CharterDTO charterDTO) {
        List<PassengerDTO> passengerDTOS = charterDTO.getPassengers();
        BigDecimal basePrice = charterDTO.getBasePrice();
        int taxRate = charterDTO.getTaxRate();

        BigDecimal totalPrice = new BigDecimal("0");
        List<PassengerTicket> passengerTickets = new ArrayList<>();
        for (PassengerDTO passengerDTO : passengerDTOS) {
            BigDecimal luggageTotalPrice = calculateLuggagePrice(passengerDTO.getLuggageCount(), basePrice);
            BigDecimal luggageTotalPriceAfterTax = calculatePriceAfterTax(luggageTotalPrice, taxRate);

            BigDecimal passengerPrice = calculatePassengerPrice(passengerDTO.getPassengerType(), basePrice);
            BigDecimal passengerPriceAfterTax = calculatePriceAfterTax(passengerPrice, taxRate);

            totalPrice = totalPrice.add(passengerPrice).add(luggageTotalPrice);

            passengerTickets.add(new PassengerTicket(
                    passengerDTO,
                    passengerPriceAfterTax,
                    luggageTotalPriceAfterTax
            ));
        }

        return new CharterPrice(
                passengerTickets,
                totalPrice,
                calculatePriceAfterTax(totalPrice, taxRate)
        );
    }

    private BigDecimal calculateLuggagePrice(int luggageCount, BigDecimal basePrice) {
        return BigDecimal.valueOf(luggageCount).multiply(basePrice).multiply(Constants.LUGGAGE_PRICE_MODIFIER);
    }

    private BigDecimal calculatePassengerPrice(PassengerType passengerType, BigDecimal basePrice){
        return passengerType.getPriceModifier().multiply(basePrice);
    };

    private BigDecimal calculatePriceAfterTax(BigDecimal price, int taxRate) {
        return MoneyUtil.calculatePriceAfterTax(price, taxRate);
    }

}
