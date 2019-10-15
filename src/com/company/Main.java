package com.company;

public class Main {


    public static void main(String[] args) {
        /*
        Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)1,(Integer)2,(Integer)3, emptyIntArr);
        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Cool","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);
        */

        // Task.MainMenu mainChoice = Task.showMenuAndGetChoice(Task.MainMenu.values());

        TestClass test1 = new TestClass("Test 1", 3);
        TestClass test2 = new TestClass("Test 2", 7);

        GenericStorage genStore = new GenericStorage(test1, test2);

        System.out.println( genStore.getObject1().toString());
        System.out.println( genStore.getObject2().toString());

    }
}
