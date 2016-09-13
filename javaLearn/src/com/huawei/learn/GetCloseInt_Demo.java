package com.huawei.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/13.
 */
public class GetCloseInt_Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double l = sc.nextDouble();
            System.out.println(Math.round(l));
        }
    }
}
