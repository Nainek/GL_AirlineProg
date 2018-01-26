package ua.com.glprocamp.airline.model.entities.airline;

import ua.com.glprocamp.airline.model.entities.aircraft.*;
import ua.com.glprocamp.airline.model.entities.IBuilder;

import java.util.List;

public class AirLine {


    private List<Airliner> airliners;

    public static class Builder implements IBuilder<AirLine> {
        AirLine airLine = new AirLine();

        public Builder setAirliners(List<Airliner> airliners){
            airLine.airliners = airliners;
            return this;
        }

        public AirLine build() {
            return airLine;
        }
    }

    private AirLine(){
    }

    public List<Airliner> getAirliners() {
        return airliners;
    }

    public void setAirliners(List<Airliner> airliners) {
        this.airliners = airliners;
    }

    public void addAirliner(Airliner airliner){
        airliners.add(airliner);
    }

}
