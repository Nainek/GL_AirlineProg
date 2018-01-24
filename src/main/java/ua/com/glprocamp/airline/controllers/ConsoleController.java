package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.views.ConsoleView;

import java.util.Scanner;

public class ConsoleController {

    private ConsoleView consoleView = new ConsoleView();
    private AirLineController airlineController = new AirLineController();

//    private SearchFoodInTheRangeStrategy typeOfSearch = new SearchFoodInTheSpecifiedRangeOfProteins();

    public ConsoleController(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void processUser(){

        Scanner sc = new Scanner(System.in);
        int choiseNumber = 0;

        consoleView.printGreetingMessage();
        consoleView.printOfferMessage();

        choiseNumber = getNumberOfTheUsersChoise(sc);
//        giveCustomersOrderToTheChief(orderNumber);
//
//        chiefController.createMeal();
//        chiefController.setMeal(chiefController.getMeal());
//
//        consoleView.printDescriptionAboutFood(chiefController.getMeal().toString());

    }


    private int getNumberOfTheUsersChoise(Scanner sc) {
        int res = 0;

        // check int - value
        while (!sc.hasNextInt()) {
            consoleView.printWrongIntInput();
            sc.next();
        }
        res = sc.nextInt();

        return res;
    }

    private void giveCustomersOrderToTheChief(int numberOfProductInMenu){
//        switch(numberOfProductInMenu){
//            case 1: {
//                chiefController.getSaladChief().setFactoryOfMeals(new GreekSaladFactory());
//                break;
//            }
//            case 2: {
//                chiefController.getSaladChief().setFactoryOfMeals(new CeasarSaladFactory());
//                break;
//            }
//            default: {
//                chiefController.getSaladChief().setFactoryOfMeals(new GlassOfWaterFactory());
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


