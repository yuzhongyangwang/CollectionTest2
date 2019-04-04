package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left > right){
            for(int i = left;i >= right;i--){
                resultList.add(i);
            }
        }else{
            for(int i = left;i <= right;i++){
                resultList.add(i);
            }
        }

        return resultList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left > right){
            for(int i = left;i >= right;i--){
                if(i % 2 == 0)
                    resultList.add(i);
            }
        }else{
            for(int i = left;i <= right;i++){
                if(i % 2 == 0)
                    resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                resultList.add(array[i]);
            }
        }
        return resultList;
    }

    public int popLastElment(int[] array) {
        int last = 0;
        if(array.length > 0)
        {
            last = array[array.length-1];
        }
        return last;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < firstArray.length; i++){
            for(int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                    resultList.add(firstArray[i]);
                }
            }
        }
        return resultList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> firstList = Arrays.asList(firstArray);
        List<Integer> secondList = Arrays.asList(secondArray);
        for(Integer rl : firstList){
            resultList.add(rl);
        }
        for(int i=0;i < secondList.size();i++){
            if(!firstList.contains(secondList.get(i))){
                resultList.add(secondList.get(i));
            }
        }
        return resultList;
    }
}
