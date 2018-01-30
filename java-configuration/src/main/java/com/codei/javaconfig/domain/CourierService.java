package com.codei.javaconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourierService {

    private AddressService addressService;
    private FlightService flightService;

    void executeService() {
        addressService.verifyAddress();
        flightService.findFlight();
    }

    @Autowired
    public void setPrintService(AddressService addressService) {
        this.addressService = addressService;
    }

    @Autowired
    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }
}
