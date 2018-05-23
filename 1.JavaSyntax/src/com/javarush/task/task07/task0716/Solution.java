package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("мера");
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("вода");
        list.add("кора");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && !list.get(i).contains("л")) list.remove(i);
            else if (!list.get(i).contains("р") && list.get(i).contains("л")) list.add(list.get(i));
        }

        return list;
    }
}