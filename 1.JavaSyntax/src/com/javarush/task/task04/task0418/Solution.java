package com.javarush.task.task04.task0418;import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (x < y) System.out.println(x);
        else System.out.println(y);
    }
}

/* 
Минимум двух чисел
*/

