package com.offer;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/18.
 */
public class MinNumberInRotateArray {

    public static int rotateArray(int[] array) {

        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String sb = sc.nextLine();
            String[] strArray = null;
            strArray = sb.split(" ");

            int[] array = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                array[i] = Integer.parseInt(strArray[i]);
            }

            int result = rotateArray(array);
            System.out.println(result);
        }
    }
}
