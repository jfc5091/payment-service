package com.example.controller;

import com.example.entity.Payment;
import com.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //necessary for spring to maintain relationships
@RequestMapping("/payment")
public class PaymentController {

    @Autowired //handles dependency injection of service
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
        return service.findPaymentHistoryByOrderId(orderId);
    }
}
