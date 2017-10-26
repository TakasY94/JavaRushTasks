package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome  {
    private static List<Horse> horses = new ArrayList<>();
    static Hippodrome game;
    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome (List list) {
        horses = list;
    }

    public void move() {
        for (Horse hor : horses) {
            hor.move();
        }
    }
    public void print() {
        for (Horse hor: horses) {
            hor.print();
        }
        for (int i=0; i<10; i++) {
            System.out.println("");
        }
    }
    public void run() throws InterruptedException {
        for (int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }


    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse h : getHorses()) {
            if (h.getDistance() > winner.getDistance()) {
                winner = h;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }




    public static void main (String[] args) throws InterruptedException{
        game = new Hippodrome(new ArrayList());
        Horse tilda1 = new Horse("Tilda1", 3, 0);
        Horse tilda2 = new Horse("Tilda2", 3, 0);
        Horse tilda3 = new Horse("Tilda3", 3, 0);
        horses.add(tilda1);
        horses.add(tilda2);
        horses.add(tilda3);
        game.run();
        game.printWinner();
    }


}