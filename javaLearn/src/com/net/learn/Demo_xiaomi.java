package com.net.learn;

import java.util.Scanner;

/**
 * Created by zhang on 2016/9/23.
 */
public class Demo_xiaomi {

    public static String doReversal(String str) {
        char[] c = str.toCharArray();
        String result = "";
        StringBuffer sb = new StringBuffer();
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] != ' ') {
                sb.append(c[i]);
            }
            if (c[i] == ' ' || i == 0) {
                result = result + sb.reverse().toString();
                if (i != 0)
                    result += " ";
                sb.delete(0, sb.length());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(doReversal(str));
    }



/*
    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("Error! ---Need parameter");
//            System.exit(-1);
//        }

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        StringBuffer buffer = new StringBuffer();
        s1.append(read);
        byte symbol;
        char[] chars = new char[s1.length()];

        s1.getChars(0, s1.length(), chars, 0);

        if (chars[chars.length - 1] == ' ' || chars[chars.length - 1] == '\t')
            symbol = 0;
        else
            symbol = 1;

        for (int i = (chars.length - 1); i >= 0; i--) {
            if (chars[i] != ' ' && chars[i] != '\t') {
                if (symbol == 0) {
                    symbol = 1;
                    buffer.delete(0, buffer.length());
                }
                buffer.append(chars[i]);
            } else if (symbol == 1) {
                symbol = 0;
                System.out.println(buffer.reverse());
                s2.append(buffer);
                s2.append(chars[i]);
            }
        }

        if (symbol == 1) {
            System.out.println(buffer.reverse());
            s2.append(buffer);
        }

        System.out.println(s2);
    }
*/
}
