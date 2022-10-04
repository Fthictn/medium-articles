package com.payment.service;

import com.payment.model.PaymentDTO;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDTO createPayment(PaymentDTO payment){
        payment.setId(1);
        return payment;
    }
}
