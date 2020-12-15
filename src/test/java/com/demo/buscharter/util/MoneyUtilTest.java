package com.demo.buscharter.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MoneyUtilTest {

    @Test
    public void shouldCalculatePriceAfterTax() {
        BigDecimal priceAfterTax = MoneyUtil.calculatePriceAfterTax(new BigDecimal("20"), 10);
        System.out.println(priceAfterTax.toString());
        assertEquals(new BigDecimal("22.00"), priceAfterTax);
    }

    @Test
    public void shouldConvertToCurrency() {
        String convertedDecimal = MoneyUtil.convertToCurrency(new BigDecimal("12.1264"), "lv-LV");
        assertEquals("12,13 €", convertedDecimal);
    }
}