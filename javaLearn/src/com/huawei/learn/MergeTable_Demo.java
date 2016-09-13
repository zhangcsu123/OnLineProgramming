package com.huawei.learn;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by zhang on 2016/9/13.
 */
public class MergeTable_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int key=sc.nextInt();
                int value=sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else{
                    map.put(key,value);
                }
            }
            for(Integer key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
