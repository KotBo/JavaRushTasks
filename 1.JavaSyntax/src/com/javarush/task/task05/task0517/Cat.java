package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    String address;
    String color;
    int age;
    int weight;


    public Cat(String name) {
        this.name = name;
        this.color = "grey";
        this.age = 8;
        this.weight = 9;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = (int) (Math.random() * 9);
        this.color = "white";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = (int) (Math.random()*9);
    }

    public  Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = (int) (Math.random()*9);
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
