package ua.com.glprocamp.airline;

import ua.com.glprocamp.airline.controllers.ConsoleController;
import ua.com.glprocamp.airline.views.ConsoleView;

public class AppRunner {


    public static void main( String[] args ) {

    ConsoleController consoleController = new ConsoleController(new ConsoleView());
    consoleController.processUser();

    }

}
