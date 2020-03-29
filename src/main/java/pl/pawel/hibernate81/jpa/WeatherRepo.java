package pl.pawel.hibernate81.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pawel.hibernate81.model.ConsolidatedWeather;

@Repository
public interface WeatherRepo extends JpaRepository<ConsolidatedWeather, Long> {

}
