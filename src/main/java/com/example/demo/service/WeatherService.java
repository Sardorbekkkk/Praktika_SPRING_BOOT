package com.example.demo.service;



import com.example.demo.request.CurrentResponse;
import com.example.demo.request.NewCurrentResponse;
import org.springframework.stereotype.Service;
import response.Weather;
import response.WeatherAPI;
import retrofit2.Response;

import java.io.IOException;

import java.util.Optional;

@Service
public class WeatherService {

    WeatherAPI api = Weather.getInstance().api();

    public Optional<CurrentResponse> post(String q) throws IOException {

        Response<NewCurrentResponse> postWeather = api.Post(q).execute();

        NewCurrentResponse curent = postWeather.body();

        Double weather = curent.getCurrent().getTemp_c();
        String city = curent.getLocation().getName();

        CurrentResponse currentResponse = new CurrentResponse(weather,city);

        return Optional.of(currentResponse);


    }



}
