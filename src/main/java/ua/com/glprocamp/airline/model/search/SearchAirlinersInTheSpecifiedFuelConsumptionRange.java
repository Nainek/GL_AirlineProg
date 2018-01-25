package ua.com.glprocamp.airline.model.search;

import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchAirlinersInTheSpecifiedFuelConsumptionRange implements SearchAircraftsStrategy<Airliner> {

    private int startRange = 0;
    private int endRange = 0;


    public List<Airliner> findAircraftInTheSpecifiedRange(List<Airliner> aircrafts, int start, int end) {
        List<Airliner> resultListOfProducts = new LinkedList<Airliner>();

        correctRange(start, end);
        setRange(start,end);

        Iterator<Airliner> it = aircrafts.iterator();
        if(it.hasNext()){
            Airliner temporaryAirlinerForComparison = it.next();
            if(checkIfAirlinerMeetsTheRequirements(temporaryAirlinerForComparison)){
                resultListOfProducts.add(temporaryAirlinerForComparison);

            }
        }

        return resultListOfProducts;
            }

    private void correctRange( int start, int end){
        if(start > end){
            int temporaryIntForSwopeVariables;
            temporaryIntForSwopeVariables = start;
            start = end;
            end = temporaryIntForSwopeVariables;
        }
    }

    private void setRange(int start, int end){
        startRange = start;
        endRange = end;
    }

    private boolean checkIfAirlinerMeetsTheRequirements(Airliner airliner) {
        return (airliner.getFuelConsumption() >= startRange && airliner.getFuelConsumption() <= endRange);
    }
}




