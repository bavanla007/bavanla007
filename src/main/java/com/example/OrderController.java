package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkouts")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void hello(String str){
    System.ou.rpintn()
    }

    @PostMapping
    public String checkout(@RequestBody String cartId) {
        return orderService.checkout(cartId);
    }

    @PostMapping("/{id}/refund")
    public String refund(@PathVariable String id, @RequestBody String reason) {
        return orderService.refund(id, reason);
    }
}
