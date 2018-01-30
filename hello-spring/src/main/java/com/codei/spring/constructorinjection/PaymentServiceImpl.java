package com.codei.spring.constructorinjection;

public class PaymentServiceImpl implements PaymentService {

    private EmailService emailService;

    public PaymentServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }


    public Boolean makePayment(String amount, String emailId) {
        emailService.sendEmail(emailId);
        return true;
    }
}
