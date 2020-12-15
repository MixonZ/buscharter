package com.demo.buscharter.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyUtil {

    private MoneyUtil(){
    }

    public static BigDecimal calculatePriceAfterTax(BigDecimal price, int taxRate) {
        return price.add(price.multiply(BigDecimal.valueOf(taxRate)).divide(new BigDecimal("100"), 2, RoundingMode.UP));
    }

    public static String convertToCurrency(BigDecimal totalPrice, String locale) {
        NumberFormat localeCostFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag(locale));
        localeCostFormat.setMinimumFractionDigits(2);
        localeCostFormat.setMaximumFractionDigits(2);

        BigDecimal roundedPrice = totalPrice.setScale(2, RoundingMode.HALF_EVEN);

        return localeCostFormat.format(roundedPrice.doubleValue());
    }
}
