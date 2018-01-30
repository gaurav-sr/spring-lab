package com.codei.spring.propertyinjection;

import java.math.BigDecimal;

public class EmployeeServiceImpl implements EmployeeService {

    private TaxService taxService;

    public String calculateGrossPay(String netPay) {
        return calculate(netPay).toString();
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    private BigDecimal calculate(String netPay) {
        BigDecimal netPayBD = new BigDecimal(netPay);
        BigDecimal tax = taxService.calculateTax(netPayBD);
        return netPayBD.subtract(tax);
    }
}
