package ua.com.glprocamp.airline.model.comparators;

import ua.com.glprocamp.airline.model.entities.Aircraft;

public class ComparatorByFlightRange implements AircraftComparator {

    public int compare(Aircraft o1, Aircraft o2) {
        return ((Integer) o1.getFlightRange()).compareTo(o2.getFlightRange());
    }

}
