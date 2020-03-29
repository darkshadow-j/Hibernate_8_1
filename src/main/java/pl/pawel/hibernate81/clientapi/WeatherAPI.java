package pl.pawel.hibernate81.clientapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pawel.hibernate81.model.ConsolidatedWeather;
import pl.pawel.hibernate81.model.Weather;

import java.util.List;

@Service
public class WeatherAPI {

    private RestTemplate restTemplate;

    private final String getWeatherURL="https://www.metaweather.com/api/location/44418/";

    public WeatherAPI() {
        restTemplate = new RestTemplate();
    }

    public List<ConsolidatedWeather> getWeather(){
        return restTemplate.getForObject(getWeatherURL, Weather.class).getConsolidatedWeather();
    }
}
