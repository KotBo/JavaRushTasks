package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String , Integer> map = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            map.put("Famname" + i , (int) (Math.random() * 1000));
        }

        return  map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String lastName = pair.getKey();
            int x = pair.getValue();
            if (x < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}