package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            ++count;
            sum+= x;
            if (x == -1) {
                ++sum;
                --count;
                double mean = (double) sum/count;
                System.out.println(mean);
                break;
            }
        }
    }
}

