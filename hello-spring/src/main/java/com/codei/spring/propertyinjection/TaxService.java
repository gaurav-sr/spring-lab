package com.codei.spring.propertyinjection;

import java.math.BigDecimal;

public interface TaxService {

    BigDecimal calculateTax(BigDecimal amount);
}
