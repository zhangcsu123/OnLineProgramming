package com.niuke.learn;

/**
 * Created by csu118 on 2016/8/25.
 */
public class Demo_Notify {
    public static void main(String[] args) {
        final Printer p = new Printer();
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Printer {
    private int flag = 1;
    public void print1() throws InterruptedException {
        synchronized (Printer.class) {
            if(flag != 1) {
                Printer.class.wait();
            }
            System.out.println("张");
            System.out.println("三");
            System.out.println("\r\n");
            flag = 2;
            Printer.class.notify();
        }
    }

    public void print2() throws InterruptedException {
        synchronized (Printer.class) {
            if(flag != 2) {
                Printer.class.wait();
            }
            System.out.println("李");
            System.out.println("四");
            System.out.println("\r\n");
            flag = 1;
            Printer.class.notify();
        }
    }
}
