package com.codei.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.time.LocalTime;

public class PaymentPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PaymentProcessor) {
            PaymentProcessor paymentProcessor = (PaymentProcessor)bean;
            paymentProcessor.setBefore(LocalTime.now());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PaymentProcessor) {
            PaymentProcessor paymentProcessor = (PaymentProcessor)bean;
            paymentProcessor.setId("101");
            paymentProcessor.setAfter(LocalTime.now());
        }
        return bean;
    }
}
