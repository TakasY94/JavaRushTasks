package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<15; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(result(arr));


    }
    static String result(int[] arr) {
        int odd = 0, even = 0;
        for (int j=0; j<arr.length; j++){
            if ((j==0) || (j % 2 == 0)) odd+=arr[j];
            else even+=arr[j];
        }
        if (odd > even) return "В домах с четными номерами проживает больше жителей.";
        else return "В домах с нечетными номерами проживает больше жителей.";
    }

}
