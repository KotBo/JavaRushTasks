package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 5 ; i++) {
            buffer.append(s);
        }
        result = buffer.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count ; i++) {
            buffer.append(s);
        }
        result = buffer.toString();
        return result;
    }

    public static void main(String[] args) {

    }
}
