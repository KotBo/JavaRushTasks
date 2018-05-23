package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] list = new String[10];
        for (int i = 7; i >= 0 ; i--) list[i] = reader.readLine();
        for (String s : list) System.out.println(s);
    }
}