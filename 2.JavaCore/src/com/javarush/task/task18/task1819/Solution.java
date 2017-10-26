package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2;
        name1 = reader.readLine();
        name2 = reader.readLine();

        FileInputStream in1 = new FileInputStream("D:\\Проганье\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\" + name1);
        FileInputStream in2 = new FileInputStream("D:\\Проганье\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\" + name2);

        byte[] data1 = new byte[in1.available()];
        byte[] data2 = new byte[in2.available()];

        in1.read(data1);
        in2.read(data2);
        FileOutputStream out = new FileOutputStream("D:\\Проганье\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\" + name1, false);
        out.write(data2);
        out = new FileOutputStream("D:\\Проганье\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1819\\" + name1, true);
        out.write(data1);

        reader.close();
        in1.close();
        in2.close();
        out.close();
        }
    }

