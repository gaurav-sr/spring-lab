package com.codei.javaconfig;

import com.codei.javaconfig.domain.DeliveryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppStarter {

    private DeliveryService deliveryService;

    public AppStarter() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        deliveryService = ctx.getBean(DeliveryService.class);
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }
}
