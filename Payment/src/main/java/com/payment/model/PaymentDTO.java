package com.payment.model;

import com.payment.validator.annotation.ValidatePaymentDetail;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class PaymentDTO {

    private int id;

    @Min(0)
    private BigDecimal price;

    @NotBlank
    private String currency;

    @ValidatePaymentDetail
    private PaymentDetail paymentDetail;
}
