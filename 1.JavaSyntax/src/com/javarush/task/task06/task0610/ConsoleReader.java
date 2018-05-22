package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
       BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
       return reader1.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader2.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader3.readLine());

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader4.readLine();
        if (s.equals("true")) return  true;
        else if (s.equals("false")) return false;
        return  false;

    }

    public static void main(String[] args) {

    }
}
