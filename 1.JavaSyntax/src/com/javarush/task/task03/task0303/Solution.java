package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/



public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(235, 0.3));
        System.out.println(convertEurToUsd(10346, 0.3));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur*course;
        return usd;
    }
}
