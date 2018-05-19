package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if ((this.strength > anotherCat.strength) && (this.age > 1 && this.age < 8 && this.age > anotherCat.age) && (this.weight) > anotherCat.weight) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
