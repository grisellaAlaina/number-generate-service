package org.example.numbergenerateservice.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class NumberGenerateService {
    public String generateNumber() {
        int randomNumber = (int)(Math.random() * 99999);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String uniqueNumber = String.format("%05d", randomNumber) + timestamp;
        return uniqueNumber;
    }


}
