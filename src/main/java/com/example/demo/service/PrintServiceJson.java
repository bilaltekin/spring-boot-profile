package com.example.demo.service;

public class PrintServiceJson implements PrintService {
    @Override
    public String printHello(String name) {
        return "Json Printed : " + name;
    }
}
