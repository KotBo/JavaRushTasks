package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println(max);
    }
}
