package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Vasya");
        Human human2 = new Human(13);
        Human human3 = new Human("Vasya", 13);
        Human human4 = new Human(13, true);
        Human human5 = new Human("Vasya", 13, true);
        Human human6 = new Human("Vasya", 13, true, 40);
        Human human7 = new Human(13, true, 40);
        Human human8 = new Human("Vasya", 13, true, 40, "Mama");
        Human human9 = new Human("Vasya", 13, true, "Mama", "Papa");
        Human human10 = new Human("Vasya", 13, true, 40, "Mama", "Papa");
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private boolean sex;
        private String humanName;
        private int age;
        private String motherName;
        private String fatherName;
        private int weight;

        public Human (String name) {
            this.humanName = name;
        }
        public Human (int age) {
            this.age = age;
        }
        public Human (String name, int age) {
            this.humanName = name;
            this.age = age;
        }
        public Human (int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, int age, boolean sex) {
            this.humanName = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (int age, boolean sex, int weight) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public Human (String name, int age, boolean sex, int weight) {
            this.humanName = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public Human (String name, int age, boolean sex, int weight, String mother) {
            this.humanName = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.motherName = mother;
        }
        public Human (String name, int age, boolean sex, String mother, String father) {
            this.humanName = name;
            this.age = age;
            this.sex = sex;
            this.motherName = mother;
            this.fatherName = father;
        }
        public Human (String name, int age, boolean sex, int weight, String mother, String father) {
            this.humanName = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.motherName = mother;
            this.fatherName = father;
        }
    }
}
