package com.huawei.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/10.
 */
public class OutputNewString_Demo {
    public static void main(String[] args) {

//        //①testSubString,即左闭又开区间,下标从0开始
//        String ss = "String";
//        System.out.println(ss.substring(1,3));

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = new String(sc.nextLine());
            if(s.length()%8 != 0)
                s = s + "00000000";

            while(s.length()>=8){
                System.out.println(s.substring(0,8));
                s = s.substring(8);
            }
        }
    }
}
