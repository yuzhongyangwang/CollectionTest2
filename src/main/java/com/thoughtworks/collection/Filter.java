package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultList = new ArrayList<>();
        for(Integer integ:array){
            if(integ % 2 == 0){
                resultList.add(integ);
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultList = new ArrayList<>();
        for(Integer integ:array){
            if(integ % 3 == 0){
                resultList.add(integ);
            }
        }
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < firstList.size(); i++){
            if(secondList.contains(firstList.get(i))){
                resultList.add(firstList.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            if(!resultList.contains(array.get(i))){
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }
//    public static void main(String args[]){
//
//        Integer[] array = new Integer[]{1, 1, 1, 2, 3};
//        List<Integer>  arraylist = Arrays.asList(array);
//        Integer[] array1 = new Integer[]{6, 2, 3, 4, 9};
//        Integer[] array2 = new Integer[]{2, 3, 5, 9, 6};
//
//        List<Integer> arrayList = Arrays.asList(array1);
//        List<Integer> arrayList1 = Arrays.asList(array2);
//        Filter ft = new Filter(arraylist);
//
//        List<Integer> resultList = ft.getCommonElements(arrayList,arrayList1);
//        System.out.println(resultList.toString());
//    }
}