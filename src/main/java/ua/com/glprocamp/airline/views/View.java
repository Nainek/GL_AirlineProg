package ua.com.glprocamp.airline.views;

import ua.com.glprocamp.airline.controllers.LanguageController;
import ua.com.glprocamp.airline.views.utils.ViewMessageUtils;

import java.util.ResourceBundle;

public class View {


    // Text's constants
    public static final String SPACE_SING = " ";

    public static final String WRONG_INPUT_INT_DATA = "input.wrong.data";
    public static final String OFFER_MESSAGE = "offer.message";
    public static final String HELLO_MESSAGE = "hello.message";



    public void printWrongInput() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.WRONG_INPUT_INT_DATA));
    }


    public void printGreeting() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.HELLO_MESSAGE), ViewMessageUtils.NEW_LINE);
    }

    public void printOfferMessage() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.OFFER_MESSAGE), ViewMessageUtils.NEW_LINE);
    }

    private void printMessage(String message){
        System.out.println(message);
    }



    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
