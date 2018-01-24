package ua.com.glprocamp.airline.views;

import ua.com.glprocamp.airline.controllers.LanguageController;

import java.util.ResourceBundle;

public class ConsoleView {


    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_NAME = "messages";

    public static ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    LanguageController.ENGLISH.getLocale());          // English
    //new Locale("ua"));                             // Ukrainian


    // Text's constants
    public static final String SPACE_SING = " ";

    public static final String WRONG_INPUT_INT_DATA = "input.wrong.data";
    public static final String OFFER_MESSAGE = "offer.message";
    public static final String HELLO_MESSAGE = "hello.message";



    public void printWrongIntInput(){
        printMessage(getWrongIntInput());
    }

    public void printGreetingMessage() {
        printMessage(getGreetingMessage());
    }

    public void printOfferMessage() {
        printMessage(getOfferMessage());
    }

    private void printMessage(String message){
        System.out.println(message);
    }


    private String getGreetingMessage() {
        return concatenationString( bundle.getString( HELLO_MESSAGE ));
    }

    private String getOfferMessage() {
        return concatenationString( bundle.getString( OFFER_MESSAGE ));
    }

    private String getWrongIntInput() {
        return concatenationString( bundle.getString( WRONG_INPUT_INT_DATA ));
    }

    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
