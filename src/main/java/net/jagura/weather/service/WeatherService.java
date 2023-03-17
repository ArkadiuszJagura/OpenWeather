package net.jagura.weather.service;

import lombok.extern.slf4j.Slf4j;
import net.jagura.weather.model.WeatherDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class WeatherService {

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "fdf139e86da1b9b2bd61888b37bc6b86";
    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeather() {
        String response = restTemplate.getForObject(WEATHER_URL + "weather?q={locality}&appid={apiKey}&units=metric&lang=pl",
                String.class, "Skwierzyna", API_KEY);
        log.info(response);
        return null;
    }
}
