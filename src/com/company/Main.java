package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        /*
        Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)1,(Integer)2,(Integer)3, emptyIntArr);

        resultInt = Task.switchPlaces(resultInt, 0,2);


        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Cool","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);
        */

        // Task.MainMenu mainChoice = Task.showMenuAndGetChoice(Task.MainMenu.values());

        ArrayList<TestClass> testArrList = new ArrayList<>();
        Stack testStack = new Stack();

        TestClass test1 = new TestClass("Test 1", 3);
        TestClass test2 = new TestClass("Test 2", 7);
        TestClass test3 = new TestClass("Test 3", 5);
        TestClass test4 = new TestClass("Test 4", 9);
        TestClass test5 = new TestClass("Test 5", 9);
        TestClass test6 = new TestClass("Test 6", 9);

        testArrList.add(test1);
        testArrList.add(test2);
        testArrList.add(test3);
        testArrList.add(test4);

        testStack.push(test5);
        testStack.push(test6);

      //  System.out.println("Biggest collection: "+Task.getBiggestCollection(testArrList, testStack));

        ArrayList<TestClass> testArrList2 = new ArrayList<>();
        testArrList2 = (ArrayList<TestClass>) Task.copyToOtherCollection(testArrList, testArrList2);
       // System.out.println(testArrList2);

        TestCollection<ArrayList> testCollection = new TestCollection<>(testArrList);

        testCollection.addElementToCollection(test5);
        System.out.println(testCollection.getSize());


        /*
        GenericStorage genStore = new GenericStorage(3);
        System.out.println( genStore.getObject1().toString());
        System.out.println( genStore.getObject2().toString());
        */

        /*
        genStore.addToArray(test1);
        genStore.addToArray(test2);
        genStore.addToArray(test3);
        genStore.addToArray(test4);

       // genStore.getElement(3);
        System.out.println(genStore.getElement(2).toString());
        */
    }
}
