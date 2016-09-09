package com.niuke.learn;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
/**
 * Created by csu118 on 2016/8/30.
 */
public class Demo_MingsRandomNum {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        TreeSet<Integer> tSet = new TreeSet<Integer>();
//        while (num != 0) {
//            tSet.add(sc.nextInt());
//            num--;
//        }
//
//        Iterator<Integer> it = tSet.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            TreeSet<Integer> set = new TreeSet<Integer>();
            int n = sc.nextInt();
            if(n>0) {
                for (int i=0;i<n;i++) {
                    set.add(sc.nextInt());
                }
            }
            for (Integer i:set) {
                System.out.println(i);
            }
        }
    }

}


