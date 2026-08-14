package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "payment-gateway")
public interface PaymentClient {

    @PostMapping("/pay")
    String pay(String method, int amount);

    @PostMapping("/refund")
    String refund(String reference, String reason);
}
