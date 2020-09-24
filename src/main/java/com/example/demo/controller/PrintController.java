package com.example.demo.controller;

import com.example.demo.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrintController {
    @Autowired
    private PrintService printService;

    @GetMapping(path = "hello/{name}" )
    public String hello(@PathVariable(value = "name") String name)
    {
        return  printService.printHello(name);
    }
}
