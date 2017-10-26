package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream instream = new FileInputStream(name);
        load(instream);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            prop.put(pair.getKey(), pair.getValue());
        }
        PrintWriter outStream = new PrintWriter(outputStream);
        prop.store(outStream, "");
        outStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод

        prop.load(inputStream);
        Set<String> names = prop.stringPropertyNames();
        for (String value : names) {
            properties.put(value, prop.getProperty(value));
        }
    }

    public static void main(String[] args) {

    }
}
