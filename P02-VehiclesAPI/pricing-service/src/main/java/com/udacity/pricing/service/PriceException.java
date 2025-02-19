package com.udacity.pricing.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Car not found")
public class PriceException extends Exception {

    public PriceException() {}

    public PriceException(String message) {
        super(message);
    }
}
