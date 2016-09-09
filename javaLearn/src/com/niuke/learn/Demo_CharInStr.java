package com.niuke.learn;

import java.util.Scanner;

/**
 * Created by csu118 on 2016/8/30.
 */
public class Demo_CharInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String s = sc.next();
        sc.close();
        char ch[] = str1.toUpperCase().toCharArray();
        int count = 0;
        s = s.toUpperCase();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == s.charAt(0)){
                count ++;
            }
        }
        System.out.println(count);
    }
}



