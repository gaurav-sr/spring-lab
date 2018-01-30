package com.codei.spring.propertyinjection;

import java.math.BigDecimal;

public class TaxServiceImpl implements TaxService {

    public BigDecimal calculateTax(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.2"));
    }
}
