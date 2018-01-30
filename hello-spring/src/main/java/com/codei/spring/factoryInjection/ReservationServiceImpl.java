package com.codei.spring.factoryInjection;

public class ReservationServiceImpl implements ReservationService {
    public Boolean reserve(Integer seats) {
        return seats < 10;
    }
}
