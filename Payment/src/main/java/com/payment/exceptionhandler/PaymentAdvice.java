package com.payment.exceptionhandler;

import com.payment.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestControllerAdvice
public class PaymentAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessage> methodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest webRequest){
        return generateErrorMessage(ex,webRequest);
    }

    private ResponseEntity<ErrorMessage> generateErrorMessage(MethodArgumentNotValidException ex, WebRequest request){

        StringBuilder errorMessageBuilder = new StringBuilder();

        ex.getAllErrors().forEach(exception -> errorMessageBuilder.append(exception.getDefaultMessage()));

        ErrorMessage errorMessage = ErrorMessage.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .timestamp(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()))
                .message(errorMessageBuilder.toString())
                .description(request.getDescription(false))
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
