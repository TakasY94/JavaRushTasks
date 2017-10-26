package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("MARCH 2 1980"));
        map.put("Stallone3", new Date("JUNE 3 1980"));
        map.put("Stallone4", new Date("JUNE 4 1980"));
        map.put("Stallone5", new Date("APRIL 5 1980"));
        map.put("Stallone6", new Date("JUNE 6 1980"));
        map.put("Stallone7", new Date("JUNE 7 1980"));
        map.put("Stallone8", new Date("JANUARY 8 1980"));
        map.put("Stallone9", new Date("JUNE 9 1980"));
        map.put("Stallone10", new Date("JUNE 10 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date month = pair.getValue();
            if(month.getMonth() == 5 || month.getMonth() == 6 || month.getMonth() == 7)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}
