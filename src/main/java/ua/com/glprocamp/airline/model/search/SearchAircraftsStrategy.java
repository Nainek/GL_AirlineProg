package ua.com.glprocamp.airline.model.search;

import java.util.List;

public interface SearchAircraftsStrategy<T>{

    List<T> findAircraftInTheSpecifiedRange(List<T> aircrafts, int start, int end);

}
