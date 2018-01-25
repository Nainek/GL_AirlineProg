package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.model.comparators.ComparatorByFlightRange;
import ua.com.glprocamp.airline.model.entities.aircraft.Aircraft;
import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.services.AirLineStatisticsService;
import ua.com.glprocamp.airline.model.services.AirLineService;

import java.util.Collections;
import java.util.List;

public class AirLineController {

    AirLine airLine;
    AirLineService airLineService;

    public AirLineController(AirLine airLine, AirLineService airLineService) {
        this.airLine = airLine;
        this.airLineService = airLineService;
    }

    public List<Airliner> findAircraftInTheSpecifiedRange(int startRange, int endRange){
        return airLineService.findAircraftInTheSpecifiedRange(airLine, startRange, endRange);
    }

    public List<Airliner> sortAirlinersByFlightRange(){

        return airLineService.sortAirlinersByFlightRange(airLine.getAirliners());

    }

    public Integer calculateCapacity() {
        return airLineService.calculateCapacity(airLine);
    }

    public Integer calculatePassengerCapacity(){
        return airLineService.calculatePassengerCapacity(airLine);
    }


    public AirLine getAirline() {
        return airLine;
    }

    public void setAirline(AirLine airLine) {
        this.airLine = airLine;
    }

    public AirLineService getAirLineService() {
        return airLineService;
    }

    public void setAirLineService(AirLineService airLineService) {
        this.airLineService = airLineService;
    }
}
