package net.jagura.weather.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "fdf139e86da1b9b2bd61888b37bc6b86";
    private RestTemplate restTemplate = new RestTemplate();

    public String getWeatherForLocality(String locality) {
        return restTemplate.getForObject(WEATHER_URL + "weather?q={locality}&appid={apiKey}&units=metric&lang=pl",
                String.class, locality, API_KEY);
    }
}
