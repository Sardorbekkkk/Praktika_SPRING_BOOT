package com.example.demo;

import com.example.demo.request.CurrentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseStatus;
import response.Weather;
import response.WeatherAPI;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class DemoApplication {



    public DemoApplication() throws IOException {
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
