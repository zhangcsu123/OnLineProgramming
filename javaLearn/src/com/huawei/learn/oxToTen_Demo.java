package com.huawei.learn;

import java.util.Scanner;

/**
 * Created by csu118 on 2016/9/1.
 */
public class oxToTen_Demo {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            while (sc.hasNext()){
                String str=sc.next().substring(2);
                System.out.println(Integer.parseInt(str,16));
            }
        }

}
