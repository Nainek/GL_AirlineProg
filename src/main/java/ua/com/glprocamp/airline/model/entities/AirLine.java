package ua.com.glprocamp.airline.model.entities;

import java.util.List;

public class AirLine {

    List<PassengerAirliner> pLiners;


    public List<PassengerAirliner> getPLiners() {
        return pLiners;
    }

    public void setPAirliners(List<PassengerAirliner> pLiners) {
        this.pLiners = pLiners;
    }
}
