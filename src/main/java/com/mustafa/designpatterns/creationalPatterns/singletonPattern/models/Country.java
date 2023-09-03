package com.mustafa.designpatterns.creationalPatterns.singletonPattern.models;

import org.springframework.stereotype.Component;

@Component
public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }
}
