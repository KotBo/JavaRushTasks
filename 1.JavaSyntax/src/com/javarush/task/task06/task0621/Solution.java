package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName, null,null);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName,null,null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandma,null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother,catFather);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;


        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override

        public String toString() {
            String fatherName = father == null ? "no father" : "father is " + father.name;
            String motherName = mother == null ? "no mother" : "mother is " + mother.name;
            return "Cat name is " + name + ", " + motherName + ", " + fatherName;
        }
    }

}
