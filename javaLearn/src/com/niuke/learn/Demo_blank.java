package com.niuke.learn;

import java.util.Scanner;
/**
 * Created by csu118 on 2016/9/1.
 */
public class Demo_blank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()) {
            n = sc.nextInt();
            if(n == 0) {
                break;
            }
            System.out.println(f(n));
        }
    }

    public static int f(int n) {
        if(n==1) {
            return 0;
        }
        if(n==2) {
            return 1;
        }
        return f(n-2) + 1;
    }

//    private static int blank;
//    public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int n;
//            while(sc.hasNext())
//            {
//                n=sc.nextInt();
//                System.out.println(Drink(n));
//            }
//    }
//
//    public static int Drink(int n)
//    {
//        if(n<=0)
//            return 0;
//        else if(n==3)
//            return 1;
//        else if(n==2)
//            return 1;
//        else//此时表明对应为3的倍数，递归
//        {
//            int h=0;
//            h=n/3;
//            return h+Drink(n-3*h+h);
//        }
//    }

}
