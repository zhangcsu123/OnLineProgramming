package com.net.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/17.
 */
public class Demo_isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int number = sc.nextInt();

            System.out.println(compare(number));
        }
    }

    public static boolean compare(int n) {
        int result = ((n & (n - 1)) == 0) ? 1 : 0;
        if (result == 0) {
            return false;
        } else {
            return true;
        }
    }

}
