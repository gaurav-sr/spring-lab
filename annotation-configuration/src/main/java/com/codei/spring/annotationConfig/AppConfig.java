package com.codei.spring.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    private PaymentService paymentService;

    public AppConfig() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        paymentService = applicationContext.getBean("paymentService", PaymentService.class);
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }
}
