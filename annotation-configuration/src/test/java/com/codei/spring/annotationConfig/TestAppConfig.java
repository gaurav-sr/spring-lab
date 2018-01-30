package com.codei.spring.annotationConfig;

import org.junit.Assert;
import org.junit.Test;

public class TestAppConfig {

    @Test
    public void testConfiguration() {
        AppConfig appConfig = new AppConfig();
        PaymentService paymentService = appConfig.getPaymentService();
        Assert.assertNotNull(paymentService);
        Assert.assertNotNull(paymentService.getCardService());
        Assert.assertNotNull(paymentService.getNotificationService());
    }


}
