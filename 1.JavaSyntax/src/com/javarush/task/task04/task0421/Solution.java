package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        if (s.length() == s1.length() && !s.equals(s1)) System.out.println("Длины имен равны");
        else if (s.equals(s1)) System.out.println("Имена идентичны");
    }
}
