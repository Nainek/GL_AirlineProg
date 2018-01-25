package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.comparators.*;
import ua.com.glprocamp.airline.model.entities.aircraft.Aircraft;
import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.search.*;

import java.util.Collections;
import java.util.List;

public class AirLineService {

    AirLineStatisticsService airLineStatisticsService = new AirLineStatisticsService();
    AircraftComparator aircraftComparator = new ComparatorByFlightRange();
    SearchAircraftsStrategy searchAircraftsStrategy = new SearchAirlinersInTheSpecifiedFuelConsumptionRange();

    public AirLine getAirlineCompany(){

        return new CreationService().getAirLineCompany();

    }

    public List<Airliner> sortAirlinersByFlightRange(List<Airliner> aircrafts){

        Collections.sort(aircrafts, new ComparatorByFlightRange());
        return aircrafts;


    }


    public int calculateCapacity(AirLine airLine) {
        return airLineStatisticsService.calculateCarryingCapacity(airLine);
    }

    public int calculatePassengerCapacity(AirLine airLine){
        return airLineStatisticsService.calculateSeatingCapasity(airLine);
    }

    public List<Airliner> findAircraftInTheSpecifiedRange(AirLine airLine, int startRange, int endRange){
        return searchAircraftsStrategy.findAircraftInTheSpecifiedRange(airLine.getAirliners(),startRange, endRange);
    }

    public AirLineStatisticsService getAirLineStatisticsService() {
        return airLineStatisticsService;
    }

    public void setAirLineStatisticsService(AirLineStatisticsService airLineStatisticsService) {
        this.airLineStatisticsService = airLineStatisticsService;
    }

    public AircraftComparator getAircraftComparator() {
        return aircraftComparator;
    }

    public void setAircraftComparator(AircraftComparator aircraftComparator) {
        this.aircraftComparator = aircraftComparator;
    }

    public SearchAircraftsStrategy getSearchAircraftsStrategy() {
        return searchAircraftsStrategy;
    }

    public void setSearchAircraftsStrategy(SearchAircraftsStrategy searchAircraftsStrategy) {
        this.searchAircraftsStrategy = searchAircraftsStrategy;
    }
}
