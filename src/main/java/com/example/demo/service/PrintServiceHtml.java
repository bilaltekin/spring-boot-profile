package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("html")
public class PrintServiceHtml implements PrintService {

    @Value("${profile.name}")
    private String profileName;
    @Override
    public String printHello(String name) {
        return "Html Printed : " + name+" "+ profileName;
    }
}
