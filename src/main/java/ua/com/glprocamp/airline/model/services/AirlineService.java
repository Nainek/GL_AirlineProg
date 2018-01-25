package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.comparators.AircraftComparator;
import ua.com.glprocamp.airline.model.comparators.ComparatorByFlightRange;
import ua.com.glprocamp.airline.model.entities.AirLine;
import ua.com.glprocamp.airline.model.entities.Aircraft;
import ua.com.glprocamp.airline.model.entities.Airliner;
import ua.com.glprocamp.airline.model.search.SearchAircraftsStrategy;
import ua.com.glprocamp.airline.model.search.SearchAirlinersInTheSpecifiedFuelConsumptionRange;

import java.util.List;

public class AirlineService {

    AirLineStatisticsService airLineStatisticsService = new AirLineStatisticsService();
    AircraftComparator aircraftComparator = new ComparatorByFlightRange();
    SearchAircraftsStrategy searchAircraftsStrategy = new SearchAirlinersInTheSpecifiedFuelConsumptionRange();

    public AirLine getAirlineCompany(){

        return new CreationService().getAirLineCompany();

    }

    public List<A>


    public int calculateCapacity(AirLine airLine) {
        return airLineStatisticsService.calculateCarryingCapacity(airLine);
    }

    public int calculatePassengerCapacity(AirLine airLine){
        return airLineStatisticsService.calculateSeatingCapasity(airLine);
    }

    public List<Airliner> findAircraftInTheSpecifiedRange(AirLine airLine, int startRange, int endRange){
        return searchAircraftsStrategy.findAircraftInTheSpecifiedRange(airLine.getAirliners(),startRange, endRange);
    }
}
