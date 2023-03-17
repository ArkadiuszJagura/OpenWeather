package net.jagura.weather.webclient.dto;

import lombok.Getter;

@Getter
public class OpenWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWindDto wind;
}
