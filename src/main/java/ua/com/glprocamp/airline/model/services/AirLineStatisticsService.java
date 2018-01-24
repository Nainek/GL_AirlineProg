package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.calculations.CalculationStrategy;
import ua.com.glprocamp.airline.model.calculations.PassengerCapasityCalculation;
import ua.com.glprocamp.airline.model.entities.AirLine;

public class AirLineStatisticsService {


    public int calculateSeatingCapasity(AirLine airLine){

        return new PassengerCapasityCalculation().calculate(airLine);
        }

    public int calculateCarryingCapasity(){

    }





}
