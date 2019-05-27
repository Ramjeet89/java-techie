package com.javatechie.slfb.example.service;

import com.javatechie.slfb.example.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("GPay")
public class GoogePay implements PaymentService {
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid successfully using GPay " + request.getPaymentMethod();
    }
}
