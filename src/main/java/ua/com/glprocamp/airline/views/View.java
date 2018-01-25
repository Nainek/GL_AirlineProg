package ua.com.glprocamp.airline.views;

import ua.com.glprocamp.airline.controllers.LanguageController;
import ua.com.glprocamp.airline.views.utils.ViewMessageUtils;

import java.util.ResourceBundle;

public class View {


    public void printWrongInputMessage() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.WRONG_INPUT_INT_DATA));
    }

    public void printGreetingMessage() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.HELLO_MESSAGE), ViewMessageUtils.NEW_LINE);
    }

    public void printOfferMessage() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.OFFER_MESSAGE), ViewMessageUtils.NEW_LINE);
    }
    public void printGoodbyeMessage() {
        printMessage(ViewLocale.BUNDLE.getString(ViewMessage.GOODBYE_MESSAGE), ViewMessageUtils.NEW_LINE);
    }

    public void printMessage(String... messages) {
        String resultedMessage = concatenationString(messages);
        System.out.println(resultedMessage);
    }

    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

}
