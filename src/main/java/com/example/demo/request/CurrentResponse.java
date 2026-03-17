package com.example.demo.request;

public class CurrentResponse {


    private Double Weather;
    private String City;



    public CurrentResponse(Double Weather, String City) {
        this.Weather = Weather;
        this.City = City;
    }

    public Double getWeather() {
        return Weather;
    }

    public void setWeather(Double Weather) {
        this.Weather = Weather;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }


}
