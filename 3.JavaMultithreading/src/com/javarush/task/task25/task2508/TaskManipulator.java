package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    String threadName;
    Thread current;

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start(String threadName) {
        TaskManipulator manipulator = new TaskManipulator();
        current = new Thread(manipulator);
        current.setName(threadName);
        current.start();
    }

    @Override
    public void stop() {
        current.interrupt();
    }
}
