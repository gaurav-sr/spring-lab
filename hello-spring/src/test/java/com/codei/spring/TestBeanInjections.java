package com.codei.spring;

import com.codei.spring.constructorinjection.PaymentService;
import com.codei.spring.factoryInjection.ReservationService;
import com.codei.spring.propertyinjection.EmployeeService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBeanInjections {

    private static AppConfig appConfig;

    @BeforeClass
    public static void init() {
        appConfig = new AppConfig();
    }

    @Test
    public void testConstructorArgInjection() {
        PaymentService paymentService = appConfig.getPaymentService();
        Boolean status = paymentService.makePayment("20.00", "sgauravs@gmail.com");
        Assert.assertTrue(status);
    }

    @Test
    public void testFactoryInjection() {
        ReservationService reservationService = appConfig.getReservationService();
        Assert.assertTrue(reservationService.reserve(4));
    }

    @Test
    public void testPropertyInjection() {
        EmployeeService employeeService =  appConfig.getEmployeeService();
        String grossPay = employeeService.calculateGrossPay("200");
        Assert.assertEquals("160.0", grossPay);
    }
}
