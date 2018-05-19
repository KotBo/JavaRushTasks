package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/



public class Solution {
    public static void main(String[] args) {
        Cat[] list = new Cat[3];
        int randomAge = (int) (Math.random() * 9);
        int randomWeight = (int) (Math.random() * 9);
        int randomStr = (int) (Math.random() * 9);
        for (int i = 0; i < list.length ; i++) list[i] = new Cat("Vaska"+"i", randomAge, randomWeight, randomStr);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}