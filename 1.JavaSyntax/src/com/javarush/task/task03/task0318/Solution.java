package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        String s1 = reader.readLine();
        System.out.println(s1 + " захватит мир через " + x + " лет. Му-ха-ха!");
    }
}
