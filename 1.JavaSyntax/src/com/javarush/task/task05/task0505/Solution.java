package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        int randomAge = (int) (Math.random() * 9);
        int randomWeight = (int) (Math.random() * 9);
        int randomStr = (int) (Math.random() * 9);
        for (int i = 0; i < cats.length ; i++)
            cats[i] = new Cat("Vaska"+"i", randomAge, randomWeight, randomStr);
        System.out.println(cats[0].fight(cats[1]));
        System.out.println(cats[1].fight(cats[2]));
        System.out.println(cats[2].fight(cats[0]));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
