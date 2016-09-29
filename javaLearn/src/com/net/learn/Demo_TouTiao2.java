package com.net.learn;

/**
 * Created by zhang on 2016/9/21.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Demo_TouTiao2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int countQuestion = sc.nextInt();
            int array[] = new int[countQuestion];
            for (int i = 0; i < countQuestion; i++)
            {
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);

            int minNum = array[0];
            int maxNum = array[countQuestion-1];
            int minNumCount = 0;

            for (int i = 1;i < countQuestion-1; i++) {
                if(array[i] - minNum <= 10 || maxNum - array[i] <= 10 ){
                    minNumCount++;
                }
            }
            System.out.println(countQuestion-minNumCount);

        }
    }
}
