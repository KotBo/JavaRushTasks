package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(reader.readLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2 == 0 || i == 0) sumEven += numbers[i];
            else if (i%2 != 0) sumOdd += numbers[i];
        }
        String s = sumEven > sumOdd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(s);
    }
}
