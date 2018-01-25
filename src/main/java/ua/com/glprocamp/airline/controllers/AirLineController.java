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

    AirLine airline;
    AirLineService airLineService;

    public AirLineController(AirLineService airLineService) {
        this.airLineService = airLineService;

    }


    public List<Airliner> findAircraftInTheSpecifiedRange(AirLine airLine, int startRange, int endRange){
        return airLineService.getSearchAircraftsStrategy().findAircraftInTheSpecifiedRange(airLine.getAirliners(),startRange, endRange);
    }

    public List<Aircraft> sortAirlinersByFlightRange(List<Aircraft> aircrafts){

        Collections.sort(aircrafts, new ComparatorByFlightRange());
        return aircrafts;

    }

    public int calculateCapacity(AirLine airLine) {
        return airLineService.getAirLineStatisticsService().calculateCarryingCapacity(airLine);
    }

    public int calculatePassengerCapacity(AirLine airLine){
        return airLineService.getAirLineStatisticsService().calculateSeatingCapasity(airLine);
    }


    public AirLine getAirline() {
        return airline;
    }

    public void setAirline(AirLine airline) {
        this.airline = airline;
    }

    public AirLineService getAirLineService() {
        return airLineService;
    }

    public void setAirLineService(AirLineService airLineService) {
        this.airLineService = airLineService;
    }
}
