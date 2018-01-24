package ua.com.glprocamp.airline.model;

/**
 *
 * @author Sikach
 * Basic interface for GoF Builder pattern realization
 * <p>
 * Class that wants to use this pattern for its instances creation should
 * implement this interface
 *
 *
 * @param <T>
 *            the generic type of the creating object
 */
public interface IBuilder<T> {
    T build();
}
