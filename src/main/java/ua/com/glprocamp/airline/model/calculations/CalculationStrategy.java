package ua.com.glprocamp.airline.model.calculations;

public interface CalculationStrategy<K,V> {

    V calculate(K k);

}
