package ua.com.glprocamp.airline.model.calculations;

import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.entities.aircraft.PassengerAirliner;

import java.util.Iterator;

public class PassengerCapasityCalculation implements CalculationStrategy<AirLine, Integer> {

    public Integer calculate(AirLine airLine) {
        int result = 0;

            Iterator<Airliner> iterator = airLine.getAirliners().iterator();
            while(iterator.hasNext()){
                result += iterator.next().getQuantityOfSits();
            }


        return result;
    }

}
