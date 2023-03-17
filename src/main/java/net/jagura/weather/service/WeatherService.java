package net.jagura.weather.service;

import lombok.extern.slf4j.Slf4j;
import net.jagura.weather.model.WeatherDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class WeatherService {

    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeather() {
        String response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=brwinow&appid=fdf139e86da1b9b2bd61888b37bc6b86&units=metric&lang=pl",
                String.class);
        log.info(response);
        return null;
    }
}
