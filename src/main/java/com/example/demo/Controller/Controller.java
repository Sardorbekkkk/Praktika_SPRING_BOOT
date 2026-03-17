package com.example.demo.Controller;

import com.example.demo.exeption.ResourceNotFoundException;
import com.example.demo.request.Current;
import com.example.demo.request.CurrentResponse;
import com.example.demo.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.Serial;
import java.security.Provider;
import java.security.PublicKey;

@RestController
public class Controller {
    private  WeatherService weatherService;

    public Controller(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/v1/{q}")
    public CurrentResponse weatherInCity(@PathVariable String q) throws IOException {
        return weatherService.post(q).orElseThrow(ResourceNotFoundException::new);

    }

}
