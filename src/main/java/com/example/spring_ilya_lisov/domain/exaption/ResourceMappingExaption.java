package com.example.spring_ilya_lisov.domain.exaption;

public class ResourceMappingExaption  extends  RuntimeException{
    public ResourceMappingExaption(String message) {
        super(message);
    }
}
