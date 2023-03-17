package net.jagura.weather.controller;

import lombok.RequiredArgsConstructor;
import net.jagura.weather.model.WeatherDto;
import net.jagura.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getStation() {
        return weatherService.getWeather();
    }

}
