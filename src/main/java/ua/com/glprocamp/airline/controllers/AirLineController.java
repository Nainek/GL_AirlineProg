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

    public List<Airliner> findAircraftInTheSpecifiedRange( int startRange, int endRange){
        return airLineService.getSearchAircraftsStrategy().findAircraftInTheSpecifiedRange(airLine.getAirliners(),startRange, endRange);
    }

    public List<Airliner> sortAirlinersByFlightRange(){

        Collections.sort(airLine.getAirliners(), new ComparatorByFlightRange());
        return airLine.getAirliners();

    }

    public int calculateCapacity() {
        return airLineService.getAirLineStatisticsService().calculateCarryingCapacity(airLine);
    }

    public int calculatePassengerCapacity(){
        return airLineService.getAirLineStatisticsService().calculateSeatingCapasity(airLine);
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
