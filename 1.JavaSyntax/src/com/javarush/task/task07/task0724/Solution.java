package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Vasya", true,60);
        Human grandpa2 = new Human("Gena", true, 65);
        Human grandma1 = new Human("Lesya", false, 59);
        Human grandma2 = new Human("Luda", false, 61);
        Human father = new Human("Alex", true, 35,grandpa1,grandma1);
        Human mother = new Human("Diana", false, 29, grandpa2, grandma2);
        Human child1 = new Human("Daniel", true, 12, father, mother);
        Human child2 = new Human("Neta", false, 9, father, mother);
        Human child3 = new Human("Michael", true, 6, father, mother);

        ArrayList<Human> list = new ArrayList<>();
        list.add(grandpa1);
        list.add(grandma1);
        list.add(grandpa2);
        list.add(grandma2);
        list.add(father);
        list.add(mother);
        list.add(child1);
        list.add(child2);
        list.add(child3);

        for (Human s : list) System.out.println(s);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















