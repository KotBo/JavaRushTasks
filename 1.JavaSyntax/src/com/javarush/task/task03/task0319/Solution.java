package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + x + " через " + y + " лет.");
    }
}
