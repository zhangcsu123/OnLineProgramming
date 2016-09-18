package com.net.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/17.
 */
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String sb = sc.nextLine();
            String[] strArray = null;
            strArray = sb.split(",");

            int array[] = new int[strArray.length];
            for(int i=0;i<strArray.length;i++) {
                array[i] = Integer.parseInt(strArray[i]);
            }

            int min=array[0];
            int i;
            int n;
            int max=array[0];
            for(n=0;n<array.length;n++) {
                if(max<array[n])
                    max=array[n];
            }
            for(i=0;i<array.length;i++) {
                if(min>array[i])
                    min=array[i];
            }
//            System.out.print("max="+max);
//            System.out.print("min="+min);
            int re;
            re = max-min;
            System.out.println(re);
        }
    }

}
