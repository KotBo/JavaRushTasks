package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < list.size(); i++) {
            if (maxLength < list.get(i).length()) {
                maxLength = list.get(i).length();
                indexOfMax = list.indexOf(list.get(i));
            }
            if (minLength > list.get(i).length()){
                minLength = list.get(i).length();
                indexOfMin = list.indexOf(list.get(i));
            }
        }
        String s = indexOfMin < indexOfMax ? list.get(indexOfMin) : list.get(indexOfMax);
        System.out.println(s);
    }
}