package com.codei.spring.postprocessor;

import java.time.LocalTime;

public class PaymentProcessor {

    private LocalTime before;
    private LocalTime after;
    private String id;

    public String processPayment(String cardNumber, Integer amount) {
        if(cardNumber != null && amount > 0) {
            System.out.println("Payment valid and processed..");
            return "COMPLETE_"+id;
        } else {
            return "FAULT";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getBefore() {
        return before;
    }

    public void setBefore(LocalTime before) {
        this.before = before;
    }

    public LocalTime getAfter() {
        return after;
    }

    public void setAfter(LocalTime after) {
        this.after = after;
    }
}
