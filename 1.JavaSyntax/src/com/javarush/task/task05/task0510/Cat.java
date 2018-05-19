package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private String color;
    private String address;
    private int weight = (int) (Math.random()*9);
    private int age = (int) (Math.random()*9);

    public void initialize(String name) {
        this.name = name;
        this.color = "red";
        this.weight = 8;
        this.age = 3;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blue";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize (int weight, String color) {
        this.color = color;
        this.address = null;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
