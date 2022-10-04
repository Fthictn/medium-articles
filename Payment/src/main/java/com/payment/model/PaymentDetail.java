package com.payment.model;

import lombok.Data;

@Data
public class PaymentDetail {

    private int installment;

    private String paymentId;

    private long paymentUserId;

    private int commissionRate;

}
