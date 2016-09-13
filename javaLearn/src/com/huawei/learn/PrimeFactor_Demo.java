package com.huawei.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/10.
 */
public class PrimeFactor_Demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long l = in.nextLong();
            System.out.println(getResult(l));
        }
    }

    static String getResult(long ulDataInput) {
        StringBuilder str = new StringBuilder();
        if(ulDataInput <= 1)
            return "请输入大于1的正整数";
        while(ulDataInput != 1){
            for(int i = 2;i <= ulDataInput;i++){
                if(ulDataInput % i == 0){
                    str.append(i+" ");
                    ulDataInput = ulDataInput/i;
                    break;//只跳出一层循环
                }
            }
        }
        return str.toString();
    }
}
