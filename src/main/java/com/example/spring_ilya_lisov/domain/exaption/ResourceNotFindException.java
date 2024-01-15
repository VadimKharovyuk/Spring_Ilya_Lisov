package com.example.spring_ilya_lisov.domain.exaption;

public class ResourceNotFindException extends RuntimeException {
    public ResourceNotFindException(String message) {
        super(message);
    }
}
