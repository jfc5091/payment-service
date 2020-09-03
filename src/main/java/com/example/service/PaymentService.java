package com.example.service;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service //necessary for spring to maintain relationships
public class PaymentService {

    @Autowired //handles dependency injection of service
    private PaymentRepository repository;

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString()); //just setting transaction id to random number
        return repository.save(payment);
    }

    public Payment findPaymentHistoryByOrderId(int orderId) {
        return repository.findByOrderId(orderId);
    }

    public String paymentProcessing() {
        return new Random().nextBoolean() ? "success" : "false";
    }
}
