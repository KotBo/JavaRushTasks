package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);

        for ( String s : result) System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> bigList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j < 2; j++) {
                bigList.add(list.get(i));
            }
        }
        return bigList;
    }
}
