package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat("Tom", "Blue", 6);

        Dog dogDog = new Dog("Dog", "Grey", 30);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        String color;
        int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }

    public static class Dog {
        String name;
        String color;
        int weight;

        public Dog(String name, String color, int weight) {
            this.name = name;
            this.color = color;
            this.weight = weight;
        }
    }
}
