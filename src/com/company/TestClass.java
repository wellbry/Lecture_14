package com.company;

public class TestClass {
    private String name;
    private int number;
    private int[] array;

    public TestClass(String name, int number){
        this.name = name;
        this.number = number;
        array = new int[]{1,2,3,5,8,13};
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
