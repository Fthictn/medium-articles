package com.payment.validator.implementation;

import com.payment.model.PaymentDetail;
import com.payment.validator.annotation.ValidatePaymentDetail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PaymentDetailValidator implements ConstraintValidator<ValidatePaymentDetail, PaymentDetail> {

    @Override
    public boolean isValid(PaymentDetail paymentDetail, ConstraintValidatorContext context) {

        String paymentId = paymentDetail.getPaymentId();

        if(Boolean.FALSE.equals(paymentId.startsWith("PAY"))){
            context.buildConstraintViolationWithTemplate("PaymentId is invalid, must start with PAY keyword")
                    .addConstraintViolation();
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

}
