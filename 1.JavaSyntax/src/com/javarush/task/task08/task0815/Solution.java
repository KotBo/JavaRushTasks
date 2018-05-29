package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("фамилия" + i, "Имя" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for ( String value : map.values()) {
            if (value.equals(name)) count++;
        }

            return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet()) {
            if (lastName.equals(key)) count++;
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
