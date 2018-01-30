package com.codei.spring;

import com.codei.spring.constructorinjection.PaymentService;
import com.codei.spring.factoryInjection.ReservationService;
import com.codei.spring.propertyinjection.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {

    private PaymentService paymentService;
    private EmployeeService employeeService;
    private ReservationService reservationService;

    public AppConfig() {
        // Here BeanFactory is used as it provides basic functionality. For more enterprise level functionality
        // ApplicationContext interface can be used.
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("application-context.xml");
        paymentService = beanFactory.getBean("paymentService", PaymentService.class);
        employeeService = beanFactory.getBean("employeeService", EmployeeService.class);
        reservationService = beanFactory.getBean("reservationService", ReservationService.class);
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public ReservationService getReservationService() {
        return reservationService;
    }
}
