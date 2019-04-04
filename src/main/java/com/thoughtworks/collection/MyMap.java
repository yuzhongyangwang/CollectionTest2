package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i < array.size(); i++){
            resultList.add(array.get(i) * 3);
        }
        return resultList;
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<>();
        for(int i=0; i < array.size(); i++){
            resultList.add(letters[array.get(i)-1]);
        }
        return resultList;
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<>();
        for(int i=0; i < array.size(); i++){
            resultList.add(numberToLetter(array.get(i)));
        }
        return resultList;
    }
    public static void main(String args[]){
        Integer[] array = new Integer[]{1, 13, 27, 30, 52, 53};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        List<String> resultList = myMap.mapLetters();
        System.out.println(resultList.toString());

    }

    public String numberToLetter(int num) {
        if (num <= 0) {
            return null;
        }
        String letter = "";
        num--;
        do {
            if (letter.length() > 0) {
                num--;
            }
            letter = ((char) (num % 26 + (int) 'a')) + letter;
            num = (int) ((num - num % 26) / 26);
        } while (num > 0);

        return letter;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultList = new ArrayList<>();
        Collections.sort(array);
        for(int i = array.size() - 1; i >= 0; i--){
            resultList.add(array.get(i));
        }
        return resultList;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
