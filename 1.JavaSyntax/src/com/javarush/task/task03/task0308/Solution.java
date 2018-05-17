package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int[] list = new int[10];
        int x = 1;
        for (int i = 0; i < 10; i++) {
            list[i] = i+1;
            x *= list[i];
        }
        System.out.println(x);
    }
}
