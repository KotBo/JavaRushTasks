package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            int x = Integer.parseInt(s);
            list.add(x);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int x : list) System.out.print(x + " ");
    }
}
