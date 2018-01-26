package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.model.services.AirLineService;
import ua.com.glprocamp.airline.model.services.CreationService;
import ua.com.glprocamp.airline.views.View;

import java.util.Scanner;

public class ConsoleController {

    private View consoleView;
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
        redirectUsersChoice(choiceNumber);
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

    private void redirectUsersChoice(int itemNumber){
        switch(itemNumber){
            case 1: {
                printResult(airlineController.
                        findAircraftInTheSpecifiedRange(getNumberOfTheUsersChoice(sc),getNumberOfTheUsersChoice(sc))
                                                        .toString());
                break;
            }
            case 2: {
                printResult(airlineController.sortAirlinersByFlightRange().toString());
                break;
            }
            case 3: {
                printResult(airlineController.calculateCapacity().toString());
                break;
            }
            case 4: {
                printResult(airlineController.calculatePassengerCapacity().toString());
                break;
            }
            default: {
                break;
            }
        }
        endOfProgram();
    }

    private void endOfProgram(){
        consoleView.printGoodbyeMessage();
    }

    private void printMessage(String...string){
        consoleView.printMessage(string);
    }

    private void printResult(String string){
        consoleView.printResultMessage();
        printMessage(string);
    }

}


