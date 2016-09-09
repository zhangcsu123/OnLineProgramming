package com.niuke.learn;

/**
 * Created by csu118 on 2016/8/25.
 */
public class Demo_Single {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
    }
}
////饿汉模式
//class Single {
//    //1私有构造函数
//    private Single() {}
//    //2创建类对象
//    private static Single s = new Single();
//    //3公共静态方法
//    public static Single getInstance() {
//        return s;
//    }
//}
//懒汉式，延迟加载模式
class Single {
    //1私有构造
    private Single(){}
    //2声明引用
    private static Single s;
    //3公共静态方法
    public static Single getInstance() {
        if(s == null) {
            s = new Single();
        }
        return s;
    }
}
