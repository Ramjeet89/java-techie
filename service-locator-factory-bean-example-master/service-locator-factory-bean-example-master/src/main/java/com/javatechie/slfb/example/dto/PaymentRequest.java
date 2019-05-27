package com.javatechie.slfb.example.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class PaymentRequest {

    @Min(value = 100, message = "Amount can't be less than 100")
    @Max(value = 999999, message = "Amount can't be more than 9999999")
    private long amount;

    private String paymentMethod;
}
