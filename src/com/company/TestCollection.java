package com.company;

import java.util.Collection;

public class TestCollection<T extends Collection> {
    private Collection collection;

    public TestCollection(T collection){
        this.collection = collection;
    }

    public void addElementToCollection(Object element){
        collection.add(element);
    }

    public int getSize(){
        return collection.size();
    }

}
