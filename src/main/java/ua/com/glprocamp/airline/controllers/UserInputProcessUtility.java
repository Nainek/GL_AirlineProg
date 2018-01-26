package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.views.View;

import java.util.Scanner;

/**
 * Utility class that provides methods for validated user's input from console
 *
 * @author Sikach
 *
 */
final class UserInputProcessUtility {

    private UserInputProcessUtility() {
        throw new RuntimeException();
    }

    static String readUserInput(Scanner scanner, View view, String message, String regex) {
        view.printMessage(message);

        String res = "";
        while (!(scanner.hasNextLine() && (res = scanner.nextLine()).matches(regex))) {
            view.printWrongInputMessage();
            view.printMessage(message);
        }

        return res;
    }
}