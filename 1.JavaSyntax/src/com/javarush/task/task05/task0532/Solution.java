package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Math.abs(Integer.parseInt(reader.readLine()));
        int[] numbers = new int[n];
        for (int i = 0; i <numbers.length ; i++)
            numbers[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i <numbers.length ; i++)
            if (numbers[0] < numbers[i]) numbers[0] = numbers[i];

        int maximum = numbers[0];

        System.out.println(maximum);
    }
}
