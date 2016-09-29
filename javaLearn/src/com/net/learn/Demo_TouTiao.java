package com.net.learn;

/**
 * Created by zhang on 2016/9/21.
 */
import java.util.Scanner;

public class Demo_TouTiao
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int count = in.nextInt();
            long compare = in.nextInt();
            long[] arr = new long[count];
            int countNumber = 0;
            for (int i = 0; i < count; i++)
            {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < arr.length-1; i++)
            {
                for (int j = i+1; j < arr.length; j++)
                {
                    long numberFin = arr[i]^arr[j];
                    if (numberFin>compare)
                    {
                        countNumber++;
                    }
                }
            }
            System.out.println(countNumber);
        }
    }
}
