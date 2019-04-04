package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reduce implements SingleLink<Integer>{

    List<Integer> arrayList;
    @Override
    public void addTailPointer(Integer item) {

    }

    @Override
    public Integer getNode(int index) {
        Integer val = arrayList.get(index-1);
        return val;
    }

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Collections.sort(arrayList);
        int maxNum = arrayList.get(arrayList.size()-1);
        return maxNum;
    }

    public double getMinimum() {
        Collections.sort(arrayList);
        int minNum = arrayList.get(0);
        return minNum;
    }

    public double getAverage() {
        double averageNum = 0;
        double num = 0;
        for(int i=0;i<arrayList.size();i++){
            num += arrayList.get(i);
        }
        averageNum = num / arrayList.size();
        return averageNum;
    }

    public double getOrderedMedian() {
        double result = 0;
        Collections.sort(arrayList);
        if(arrayList.size() % 2 == 0){
            result = (double)(arrayList.get(arrayList.size() / 2 -1)+arrayList.get(arrayList.size() / 2)) / 2;
        }
        else{
            result = arrayList.get(arrayList.size() / 2);
        }
        return result;
    }

    public int getFirstEven() {
        int firstEven = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0)
            {
                firstEven = arrayList.get(i);
                break;
            }
        }
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        int indexOfFirstEven = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) % 2 == 0)
            {
                indexOfFirstEven = i;
                break;
            }
        }
        return indexOfFirstEven;
    }

    public boolean isEqual(List<Integer> arrayList2) {
        boolean isEqual = true;

        if(arrayList.size()==arrayList2.size()){
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i) != arrayList2.get(i)){
                    isEqual = false;
                }
            }
        }else{
            isEqual = false;
        }
        return isEqual;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double result = 0;
        if(arrayList.size() % 2 == 0){
            result = (double)(arrayList.get(arrayList.size() / 2 -1)+arrayList.get(arrayList.size() / 2)) / 2;
        }
        else{
            result = arrayList.get(arrayList.size() / 2);
        }
        return result;
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (int i = arrayList.size()-1; i >= 0; i--){
            if(arrayList.get(i) % 2 == 1)
            {
                lastOdd = arrayList.get(i);
                break;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int indexOfLastOdd = 0;
        for (int i = arrayList.size()-1; i >= 0; i--){
            if(arrayList.get(i) % 2 == 1)
            {
                indexOfLastOdd = i;
                break;
            }
        }
        return indexOfLastOdd;
    }
}
