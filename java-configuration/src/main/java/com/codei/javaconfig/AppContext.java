package com.codei.javaconfig;

import com.codei.javaconfig.domain.AddressService;
import com.codei.javaconfig.domain.CourierService;
import com.codei.javaconfig.domain.DeliveryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is JAVA based configuration. @Configuration is equivalent to
 * <beans /> . And <bean> is equivalent to @Bean
 */
@Configuration
@ComponentScan(basePackages = "com.codei.javaconfig")
public class AppContext {

    @Bean
    public AddressService addressService() {
        return new AddressService();
    }

    @Bean
    public CourierService courierService() {
        return new CourierService();
    }

    @Bean
    public DeliveryService deliveryService() {
        return new DeliveryService();
    }

}

