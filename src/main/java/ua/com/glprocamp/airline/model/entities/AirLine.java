package ua.com.glprocamp.airline.model.entities;

import java.util.List;

public class AirLine {


    private List<Airliner> airliners;
    private List<PassengerAirliner> pLiners;


    public static class Builder implements IBuilder<AirLine> {
        AirLine airLine = new AirLine();

        public Builder setAirliners(List<Airliner> airliners){
            airLine.airliners = airliners;
            return this;
        }

        public Builder setPLiners(List<PassengerAirliner> pLiners){
            airLine.pLiners = pLiners;
            return this;
        }

        public AirLine build() {
            return airLine;
        }
    }

    private AirLine(){

    }

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
