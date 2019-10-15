package com.company;

public class GenericStorage<T1, T2> {
    private T1 object1;
    private T2 object2;
    private T1[] array;


    public GenericStorage(T1 t1, T2 t2) {
        object1 = t1;
        object2 = t2;
    }

    public GenericStorage(int size) {
        array = (T1[]) new Object[size];
    }

    public T1 getObject1() {
        return object1;
    }

    public T2 getObject2() {
        return object2;
    }

    public void addToArray(T1 t1) {
        if (array[array.length - 1] == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null){
                    array[i] = t1;
                    return;
                }
            }
        }else{
            System.out.println("You have exceeded max size of the array, no more space!");
        }
    }

    public T1 getElement(int index){
        if (index < array.length){
            return array[index];
        } else {
            System.out.println("Error. Index out of bounds");
            return null;
        }
    }
}
