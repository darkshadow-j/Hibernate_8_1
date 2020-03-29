package pl.pawel.hibernate81.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.pawel.hibernate81.clientapi.WeatherAPI;
import pl.pawel.hibernate81.jpa.WeatherRepo;

@Service
public class WeatherUpdate {

    WeatherAPI weatherAPI;
    WeatherRepo weatherRepo;

    public WeatherUpdate(WeatherAPI weatherAPI, WeatherRepo weatherRepo) {
        this.weatherAPI = weatherAPI;
        this.weatherRepo = weatherRepo;
    }

    @Scheduled(cron = "0 0 * * * *")
    public void Update(){
        this.weatherRepo.saveAll(weatherAPI.getWeather());
        System.out.println("Update");
    }



}
