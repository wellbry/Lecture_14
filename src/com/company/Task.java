package com.company;

import java.util.Collection;
import java.util.Collections;
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
                return menuItems[menuChoice - 1];
            } catch (Exception e) {
                System.out.println("Invalid choice, try again.");
            }
        } while (menuChoice != (menuItems.length));
        return null;
    }

    public static <T1 extends Number, T2 extends Number> float addNumbers(T1 t1, T2 t2){
        return t1.floatValue() + t2.floatValue();
    }

    public static <T> T[] switchPlaces(T[] inArray, int index1, int index2){
        T temp = inArray[index1];
        inArray[index1] = inArray[index2];
        inArray[index2] = temp;
        return inArray;
    }

    public static <T1 extends Collection, T2 extends Collection> Collection getBiggestCollection(T1 t1, T2 t2){
        if (t1.size() < t2.size()){
            return t2;
        } else {
            return t1;
        }
    }

    public static <T extends Collection> Collection copyToOtherCollection(T c1, T c2){
        c2 = c1;
        return c2;
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
