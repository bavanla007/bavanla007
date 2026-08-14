package com.example;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentClient paymentClient;

    public OrderService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public String checkout(String cartId) {
        return paymentClient.pay("card", 100);
    }

    public String refund(String orderId, String reason) {
        return paymentClient.refund(orderId, reason);
    }
}
