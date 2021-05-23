package com.zqs.singleton;

/**
 * @description: 线程不安全的单例
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingleTon2 {

    public void method() {
        System.out.println("test");
    }

    // 3.自行提供一个全局变量(静态、私有)
    private static MySingleTon2 mySingleTon2;

    // 1.构造方法私有化
    private MySingleTon2() {
    }

    // 2.提供实例化方法
    public static MySingleTon2 getInstance() {
        /**
         * 如果已经实例化,就返回
         * 如果没有,则进行实例化
         */
        if (mySingleTon2 == null) {
            mySingleTon2 = new MySingleTon2();
        }
        return mySingleTon2;
    }
}
