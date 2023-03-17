package net.jagura.weather.webclient.dto;

import lombok.Getter;

@Getter
public class OpenWeatherMainDto {
    private float temp;
    private float feels_like;
    private int pressure;
}
