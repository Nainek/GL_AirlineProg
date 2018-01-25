package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.aircraft.PassengerAirliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;

import java.util.List;

public class CreationService {

    AirLine airLine;
    List<Airliner> airlinerList;


    public void createAirLineCompanyWithAirliners(){
        createAircraftsForAirline();
        airLine = new AirLine.Builder()
                .setAirliners(airlinerList)
                .build();

    }

    public void createAircraftsForAirline(){
        Airliner airliner1 = new PassengerAirliner.Builder().setCargoCapasity()
                .build();
    }




    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }

    public AirLine getAirLineCompany(){
        return airLine;
    }

}
