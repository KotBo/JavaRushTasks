package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigBoy = new int[20];
        for (int i = 0; i <bigBoy.length ; i++) bigBoy[i] = Integer.parseInt(reader.readLine());
        int[] halfBoy1 = new int[10];
        int[] halfBoy2 = new int[10];
        for (int i = 0; i <halfBoy1.length ; i++) {
            halfBoy1[i] = bigBoy[i];
            halfBoy2[i] = bigBoy[i+10];
        }
        for (int i : halfBoy2) System.out.println(i);
    }
}
