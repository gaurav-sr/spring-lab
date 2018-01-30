package com.codeinstance.springflab;

import com.codei.javaconfig.AppStarter;
import com.codei.javaconfig.domain.DeliveryService;
import org.junit.Test;

public class TestCodeConfiguration {

    @Test
    public void test() {
        AppStarter cc = new AppStarter();
        DeliveryService deliveryService = cc.getDeliveryService();
        deliveryService.deliver();
    }

}
