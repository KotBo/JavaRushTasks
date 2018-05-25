package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(reader.readLine());
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (min > numbers[i]) min = numbers[i];
            else if ( max < numbers[i]) max = numbers[i];
        }
        minimum = min;
        maximum = max;


        System.out.print(maximum + " " + minimum);
    }
}
