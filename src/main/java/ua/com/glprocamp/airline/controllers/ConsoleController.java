package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.services.AirLineService;
import ua.com.glprocamp.airline.model.services.CreationService;
import ua.com.glprocamp.airline.views.View;

import java.util.Scanner;

public class ConsoleController {

    private View consoleView = new View();
    private AirLineController airlineController = new AirLineController(new CreationService().createAirLineCompanyWithAirliners(), new AirLineService());

    private Scanner sc = new Scanner(System.in);

    public ConsoleController(View consoleView) {
        this.consoleView = consoleView;
    }

    public void processUser(){
        consoleView.printGreetingMessage();
        consoleView.printOfferMessage();

        int choiceNumber = 0;
        choiceNumber = getNumberOfTheUsersChoice(sc);
        redirectUserChoice(choiceNumber);
    }


    private int getNumberOfTheUsersChoice(Scanner sc) {
        int res = 0;
        while (!sc.hasNextInt()) {
            consoleView.printWrongInputMessage();
            sc.next();
        }
        res = sc.nextInt();

        return res;
    }

    private void redirectUserChoice(int itemNumber){
        switch(itemNumber){
            case 1: {
                consoleView.printMessage(airlineController.
                        findAircraftInTheSpecifiedRange(getNumberOfTheUsersChoice(sc),getNumberOfTheUsersChoice(sc))
                                                        .toString());
                break;
            }
            case 2: {
                consoleView.printMessage(airlineController.sortAirlinersByFlightRange().toString());
                break;
            }
            case 3: {
                consoleView.printMessage(airlineController.calculateCapacity().toString());
                break;
            }
            case 4: {
                consoleView.printMessage(airlineController.calculatePassengerCapacity().toString());
                break;
            }
            default: {
                consoleView.printGoodbyeMessage();
                break;
            }
        }
    }
}


