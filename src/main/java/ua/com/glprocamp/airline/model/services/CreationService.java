package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.entities.airline.AirLine;

public class CreationService {

    AirLine airLine;



    public void createAirLineCompanyWithAirliners(){
        airLine = new AirLine.Builder().build();

    }

    public void createAircraftsForAirline(){

    }




    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }

    public AirLine getAirLineCompany(){
        return airLine;
    }

}
