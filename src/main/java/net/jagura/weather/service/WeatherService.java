package net.jagura.weather.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.jagura.weather.model.WeatherDto;
import net.jagura.weather.webclient.WeatherClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherDto getWeather() {
        String response = weatherClient.getWeatherForLocality("skwierzyna");
        log.info(response);
        return null;
    }


}
