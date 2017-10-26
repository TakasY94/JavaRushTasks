package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>list = new ArrayList<String>();
        ArrayList<String>list2 = new ArrayList<String>();
        list.add("text");
        list2.add("sometext");
        ArrayList<String>[] list3 = new ArrayList[2];
        list3[0] = list;
        list3[1] = list2;
        return list3;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}