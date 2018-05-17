package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 0; i < 3; i++) list.add(Integer.parseInt(reader.readLine()));
        Collections.sort(list);
        System.out.println(list.get(1));
    }
}
