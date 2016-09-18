package com.huawei.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhang on 2016/9/16.
 */
public class Delete_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                list.add(i);
            }
            int i=0;
            while (list.size() > 1) {
                i=(i + 2) % list.size();
            }
            System.out.println(list.get(0));
        }
    }
}