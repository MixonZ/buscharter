package com.demo.buscharter.service.impl;

import com.demo.buscharter.BusCharterApplication;
import com.demo.buscharter.rest.api.CharterDTO;
import com.demo.buscharter.domain.PassengerType;
import com.demo.buscharter.rest.api.PassengerDTO;
import com.demo.buscharter.domain.CharterPrice;
import com.demo.buscharter.service.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BusCharterApplication.class)
class PriceServiceImplTest {

    @Autowired
    PriceService priceService;

    @Test
    public void shouldCreateTicketPrice() {

        PassengerDTO adultPassengerDTO = new PassengerDTO(
                PassengerType.ADULT,
                2
        );
        PassengerDTO childPassengerDTO = new PassengerDTO(
                PassengerType.CHILD,
                1
        );

        CharterDTO charterDTO = new CharterDTO(BigDecimal.valueOf(10), 21, List.of(childPassengerDTO, adultPassengerDTO));
        CharterPrice result = priceService.getTicketPriceForCharter(charterDTO);


        assertEquals(2, result.getPassengerTickets().size());
        assertEquals(new BigDecimal("24.0"), result.getTotalPrice());
        assertEquals(new BigDecimal("29.04"), result.getTotalPriceAfterTax());

    }

}