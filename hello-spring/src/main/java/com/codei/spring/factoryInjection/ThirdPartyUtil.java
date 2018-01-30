package com.codei.spring.factoryInjection;

import com.codei.spring.propertyinjection.EmployeeServiceImpl;

public class ThirdPartyUtil {

    public static ReservationService instantiate() {
        return new ReservationServiceImpl();
    }

}
