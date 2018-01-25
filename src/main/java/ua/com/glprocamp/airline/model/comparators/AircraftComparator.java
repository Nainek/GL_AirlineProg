package ua.com.glprocamp.airline.model.comparators;

import ua.com.glprocamp.airline.model.entities.aircraft.Aircraft;

import java.util.Comparator;

public interface AircraftComparator  extends Comparator<Aircraft> {

        int compare(Aircraft o1, Aircraft o2);

}

