package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("s1", df.parse("AUGUST 1 1980"));
        map.put("s2", df.parse("JULY 1 1980"));
        map.put("s3", df.parse("OCTOBER 1 1980"));
        map.put("s4", df.parse("SEPTEMBER 1 1980"));
        map.put("s5", df.parse("NOVEMBER 1 1980"));
        map.put("s6", df.parse("JUN 1 1980"));
        map.put("s7", df.parse("JANUARY 1 1980"));
        map.put("s8", df.parse("FEBRUARY 1 1980"));
        map.put("s9", df.parse("MARCH 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> mpCopy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : mpCopy.entrySet()) {
            String dt = pair.getValue().toString();
            if ((dt.contains("Jun")) || (dt.contains("Jul")) || (dt.contains("Aug"))) {
                map.remove(pair.getKey());
            }

        }
    }

    public static void main(String[] args) {

    }
}
