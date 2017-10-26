package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {

        int i = 0;
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String [] ret = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
            ret[i] = tokenizer.nextToken();
            i++;
        }
        return ret;
    }
}
