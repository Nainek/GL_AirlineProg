package ua.com.glprocamp.airline.model.entities;

import java.util.List;
import java.util.Spliterators;

public class AirLine {


    private List<Airliner> airliners;
    private List<PassengerAirliner> pLiners;


    public List<PassengerAirliner> getPLiners() {
        return pLiners;
    }

    public void setPAirliners(List<PassengerAirliner> pLiners) {
        this.pLiners = pLiners;
    }

    public List<Airliner> getAirliners() {
        return airliners;
    }

    public void setAirliners(List<Airliner> airliners) {
        this.airliners = airliners;
    }

    public void addAirliner(Airliner airliner){
        airliners.add(airliner);
        if(airliner instanceof PassengerAirliner){
            pLiners.add((PassengerAirliner) airliner);
        }

    }


}
