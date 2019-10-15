package com.company;

import java.util.Scanner;

public class Task {

    //  Scanner scan = new Scanner(System.in);

    public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr) {
        emptyArr[0] = param1;
        emptyArr[1] = param2;
        emptyArr[2] = param3;
        return emptyArr;
    }

    public static <T extends HasDescription> T showMenuAndGetChoice(T[] menuItems) {
        System.out.println("Welcome to the bank.\nMake a choice.");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i].getDescription());
        }
        int menuChoice = 0;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                menuChoice = Integer.parseInt(scan.nextLine());
                // menuChoice = InputSanitizers.convertToInt(scan.nextLine());

                return menuItems[menuChoice - 1];
            } catch (Exception e) {
                System.out.println("Invalid choice, try again.");
            }
        } while (menuChoice != (menuItems.length));
        return null;
    }

    public enum MainMenu implements HasDescription {
        ADD_ACCOUNT("Add new account"),
        DELETE_ACCOUNT("Delete account"),
        SHOW_ACCOUNT_OVERVIEW("Show account Overview"),
        QUIT("Quit");

        private String description;

        private MainMenu(String description) {
            this.description = description;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    public enum CustomerMenu implements HasDescription {
        SHOW_ACCOUNT_DETAILS("Show Account Details"),
        INSERT_MONEY("Deposit Money"),
        LOG_OUT("Log Out");

        private String description;

        private CustomerMenu(String description) {
            this.description = description;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }
}
