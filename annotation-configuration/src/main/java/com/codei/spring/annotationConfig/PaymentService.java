package com.codei.spring.annotationConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private CardService cardService;
    private NotificationService notificationService;

    public PaymentService() {

    }

    @Autowired
    public PaymentService(CardService cardService, NotificationService notificationService) {
        this.cardService = cardService;
        this.notificationService = notificationService;
    }


    public CardService getCardService() {
        return cardService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
