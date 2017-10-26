package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedReader inputStream = new BufferedReader(new FileReader(name1));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(name2));
        RandomAccessFile fileOne = new RandomAccessFile(name1, "r");
        RandomAccessFile fileTwo = new RandomAccessFile(name2, "rw");

        while(true) {
            String s;
            s = fileOne.readLine();
            if (s == null) break;
            System.out.println(s);
            String[] tmp = s.split(" ");
            for (String x : tmp) {
                int i = (int) Math.round(Double.parseDouble(x));
                fileTwo.writeBytes(String.valueOf(i) + " ");
            }
        }
        reader.close();
        fileOne.close();
        fileTwo.close();
    }
}
