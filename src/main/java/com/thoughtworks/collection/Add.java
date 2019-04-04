package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;
        if(leftBorder > rightBorder){
            int border = leftBorder;
            leftBorder = rightBorder;
            rightBorder = border;
        }

        for(int i = leftBorder;i <= rightBorder;i++){
            if(i % 2 == 0){
                result += i;
            }
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int result = 0;
        if(leftBorder > rightBorder){
            int border = leftBorder;
            leftBorder = rightBorder;
            rightBorder = border;
        }

        for(int i = leftBorder;i <= rightBorder;i++){
            if(i % 2 == 1){
                result += i;
            }
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (int i=0;i<arrayList.size();i++){
            result += arrayList.get(i) * 3 +2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        List<Integer> resultList = new ArrayList<>();
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2 == 1){
                resultList.add(arrayList.get(i) * 3 +2);
            }else{
                resultList.add(arrayList.get(i));
            }
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) % 2 == 1){
                result += arrayList.get(i) * 3 +5;
            }
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {

        double result = 0;
        List<Integer> doubleList = new ArrayList<>();
        for(Integer arr:arrayList ){
            if(arr % 2 == 0)
                doubleList.add(arr);
        }
        if(doubleList.size() % 2 == 0){
            result = (doubleList.get(doubleList.size() / 2 - 1) + doubleList.get(doubleList.size() / 2)) / 2;
        }else{
            result = doubleList.get(doubleList.get(doubleList.size() / 2));
        }
        return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double result = 0;
        int i = 0;
        for(Integer arr:arrayList ){
            if(arr % 2 == 0)
            {
                result += arr;
                i++;
            }
        }
        result /= i;
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean isExisted = false;
        for (Integer arr : arrayList){
            if(arr % 2 == 0 && arr ==specialElment){
                isExisted = true;
            }
        }
        return isExisted;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer arr : arrayList){
            if((arr % 2 == 0) && !resultList.contains(arr)){
                resultList.add(arr);
            }
        }
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {

        List<Integer> resultList = new ArrayList<>();
        List<Integer> headList = new ArrayList<>();
        List<Integer> tailList = new ArrayList<>();
        for (Integer arr : arrayList){
            if((arr % 2 == 0)){
                headList.add(arr);
            }
            else
            {
                tailList.add(arr);
            }
        }
        Collections.sort(headList);
        Collections.sort(tailList);

        for(int i = 0; i < headList.size(); i++){
            resultList.add(headList.get(i));
        }
        for(int j = tailList.size()-1; j >=0; j--){
            resultList.add(tailList.get(j));
        }
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++){
            resultList.add(3 * (arrayList.get(i)+arrayList.get(i+1)));
        }
        return resultList;
    }


}
