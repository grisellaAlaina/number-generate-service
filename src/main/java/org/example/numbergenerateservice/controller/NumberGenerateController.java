package org.example.numbergenerateservice.controller;

import org.example.numbergenerateservice.service.NumberGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class NumberGenerateController {

    private final NumberGenerateService numberGenerateService;

    public NumberGenerateController(NumberGenerateService numberGenerateService) {
        this.numberGenerateService = numberGenerateService;
    }

    @GetMapping
    public String generateNumber() {
        return numberGenerateService.generateNumber();
    }
}
