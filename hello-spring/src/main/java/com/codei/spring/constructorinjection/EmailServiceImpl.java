package com.codei.spring.constructorinjection;


public class EmailServiceImpl implements EmailService {

    public void sendEmail(String emailId) {
        System.out.println("Sending email...");
    }
}
