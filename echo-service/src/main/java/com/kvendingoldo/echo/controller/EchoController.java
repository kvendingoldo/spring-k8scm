package com.kvendingoldo.echo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class EchoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoController.class);

    @Value("${cm.tst}")
    private String testProperty;

    @GetMapping("/test")
    public String getTestProperty() {
        LOGGER.info("Value {} will be returned", testProperty);
        return testProperty;
    }
}
