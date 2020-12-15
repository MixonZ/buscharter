package com.demo.buscharter.service;

import com.demo.buscharter.rest.api.CharterDTO;
import com.demo.buscharter.domain.CharterPrice;

public interface PriceService {

    public CharterPrice getTicketPriceForCharter(CharterDTO charterDTO);
}
