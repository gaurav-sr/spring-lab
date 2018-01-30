package com.codei.javaconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    @Autowired
    private CourierService courierService;

    public void deliver() {
        System.out.println("Delivery Service calling CourierService");
        courierService.executeService();
    }
}
