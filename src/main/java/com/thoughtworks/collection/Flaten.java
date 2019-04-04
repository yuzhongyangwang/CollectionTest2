package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                resultList.add(array[i][j]);
            }
        }
        return resultList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                if(!resultList.contains(array[i][j]))
                    resultList.add(array[i][j]);
            }
        }
        return resultList;
    }
}
