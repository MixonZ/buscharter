package com.demo.buscharter.rest.controller;

import com.demo.buscharter.rest.api.CharterDTO;
import com.demo.buscharter.rest.api.CharterPriceDTO;
import com.demo.buscharter.service.PriceService;
import com.demo.buscharter.service.mapper.CharterPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/api")
public class CharterController {

    @Autowired
    private PriceService priceService;
    @Autowired
    private CharterPriceMapper charterPriceMapper;

    @PostMapping(value = "/calculate-ticket")
    public ResponseEntity<CharterPriceDTO> getCharterPrice(@RequestBody CharterDTO charterDTO) {
        CharterPriceDTO charterPrice = charterPriceMapper.toRestCharterPrice(priceService.getTicketPriceForCharter(charterDTO));
        return ResponseEntity.ok()
                .body(charterPrice);
    }
}

