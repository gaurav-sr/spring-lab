package com.codei.spring.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    private PaymentProcessor paymentProcessor;

    AppConfig() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        paymentProcessor = applicationContext.getBean("paymentProcessor", PaymentProcessor.class);
    }

    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

}
