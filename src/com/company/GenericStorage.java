package com.company;

public class GenericStorage <T1, T2> {
    private T1 object1;
    private T2 object2;


    public GenericStorage(T1 t1, T2 t2){
        object1 = t1;
        object2 = t2;
    }

    public T1 getObject1() {
        return object1;
    }

    public T2 getObject2() {
        return object2;
    }
}
