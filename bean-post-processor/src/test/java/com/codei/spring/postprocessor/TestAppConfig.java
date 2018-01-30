package com.codei.spring.postprocessor;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestAppConfig {

    private Logger log = Logger.getLogger("TestAppConfig");

    @Test
    public void testPostProcessorValue() {
        AppConfig appConfig = new AppConfig();
        PaymentProcessor paymentProcessor = appConfig.getPaymentProcessor();
        String result = paymentProcessor.processPayment("123456789", 20);
        Assert.assertNotNull(paymentProcessor.getBefore());
        Assert.assertNotNull(paymentProcessor.getAfter());
        log.info("Time stamp before initialization "+ paymentProcessor.getBefore());
        log.info("Time stamp after initialization "+ paymentProcessor.getAfter());
        Assert.assertTrue("COMPLETE_101".equals(result));
    }


}
