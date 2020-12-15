package com.demo.buscharter.service.mapper;

import com.demo.buscharter.domain.CharterPrice;
import com.demo.buscharter.rest.api.CharterPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.demo.buscharter.util.MoneyUtil.convertToCurrency;

@Service
public class CharterPriceMapper {

    @Autowired
    private PassangerTicketMapper passangerTicketMapper;

    public CharterPriceDTO toRestCharterPrice(CharterPrice charterPrice) {
        CharterPriceDTO charterPriceDTO = null;
        if (charterPrice != null) {
            charterPriceDTO = new CharterPriceDTO();
            charterPriceDTO.setPassengerTickets(passangerTicketMapper.toRestListPassengerTicket(charterPrice.getPassengerTickets()));
            charterPriceDTO.setTotalPrice(convertToCurrency(charterPrice.getTotalPrice(), "lv-LV"));
            charterPriceDTO.setTotalPriceAfterTax(convertToCurrency(charterPrice.getTotalPriceAfterTax(), "lv-LV"));
        }
        return charterPriceDTO;
    }
}
