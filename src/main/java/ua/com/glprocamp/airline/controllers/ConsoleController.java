package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.model.services.AirLineService;
import ua.com.glprocamp.airline.views.View;

import java.util.Scanner;

public class ConsoleController {

    private View consoleView = new View();
    private AirLineController airlineController = new AirLineController(new AirLineService());

//    private SearchFoodInTheRangeStrategy typeOfSearch = new SearchFoodInTheSpecifiedRangeOfProteins();

    public ConsoleController(View consoleView) {
        this.consoleView = consoleView;
    }

    public void processUser(){

        consoleView.printGreetingMessage();
        consoleView.printOfferMessage();

        Scanner sc = new Scanner(System.in);
        int choiceNumber = 0;
        choiceNumber = getNumberOfTheUsersChoice(sc);
        redirectUserChoice(choiceNumber);
//
//        chiefController.createMeal();
//        chiefController.setMeal(chiefController.getMeal());
//
//        consoleView.printDescriptionAboutFood(chiefController.getMeal().toString());

    }


    private int getNumberOfTheUsersChoice(Scanner sc) {
        int res = 0;

        // check int - value
        while (!sc.hasNextInt()) {
            consoleView.printWrongInputMessage();
            sc.next();
        }
        res = sc.nextInt();

        return res;
    }

    private void redirectUserChoice(int itemNumber){
//        switch(itemNumber){
//            case 1: {
//                airlineController..setFactoryOfMeals(new GreekSaladFactory());
//                break;
//            }
//            case 2: {
//                airlineController.getSaladChief().setFactoryOfMeals(new CeasarSaladFactory());
//                break;
//            }
//            case 3: {
//                airlineController.getSaladChief().setFactoryOfMeals(new CeasarSaladFactory());
//                break;
//            }
//            default: {
//                airlineController.getSaladChief().setFactoryOfMeals(new GlassOfWaterFactory());
//                break;
//            }
//        }
    }

//    public ChiefController getChiefController() {
//        return chiefController;
//    }
//
//    public void setChiefController(ChiefController chiefController) {
//        this.chiefController = chiefController;
//    }
//
//    public SearchFoodInTheRangeStrategy getTypeOfSearch() {
//        return typeOfSearch;
//    }
//
//    public void setTypeOfSearch(SearchFoodInTheRangeStrategy typeOfSearch) {
//        this.typeOfSearch = typeOfSearch;
//    }
//
}


