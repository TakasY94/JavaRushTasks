package com.javarush.task.task22.task2202;


import org.omg.SendingContext.RunTime;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        int firstSpace = string.indexOf(" ") + 1;
        char[] chars = string.toCharArray();
        int space = 0;
        int lastSpace = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == ' ') {
                space++;
                if (space == 4) {
                    lastSpace = string.length();
                }
                else if (space == 5) {
                    lastSpace = i;
                    break;
                }
            }
        }
        if (space < 4) throw new TooShortStringException();
        string = string.substring(firstSpace, lastSpace);
        return string;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
