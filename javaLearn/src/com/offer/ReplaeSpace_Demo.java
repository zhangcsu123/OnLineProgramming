package com.offer;

import java.util.Scanner;

/**
 * Created by csu118 on 2016/9/15.
 */
public class ReplaeSpace_Demo {

    public static String replaceSpace(StringBuffer str){
        String sti = str.toString();
        char[] strChar=sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' '){
                stb.append("%20");
            }else{
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String sb = sc.nextLine();
            System.out.println(replaceSpace(new StringBuffer(sb)));
        }
    }

}
