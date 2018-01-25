package ua.com.glprocamp.airline.model.calculations;

import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;

import java.util.Iterator;


public class CapasityCalculation implements CalculationStrategy<AirLine, Integer> {

    public Integer calculate(AirLine airLine) {
        int result = 0;

        Iterator<Airliner> iterator = airLine.getAirliners().iterator();
        while(iterator.hasNext()){
            result += iterator.next().getCarryingCapasity();
        }
        return result;
    }

}
