package com.zqs.singleton;

/**
 * @description: 线程安全的单例
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingleTon3 {

    public void method() {
        System.out.println("test");
    }

    // 3.自行提供一个全局变量(静态、私有)
    private static MySingleTon3 mySingleTon3;

    // 1.构造方法私有化
    private MySingleTon3() {
    }

    // 2.提供一个静态方法来获得实例化
    public synchronized static MySingleTon3 getInstance() {
        /**
         * 如果已经实例化,就返回
         * 如果没有,则进行实例化
         */
        if (mySingleTon3 == null) {
            mySingleTon3 = new MySingleTon3();
        }
        return mySingleTon3;
    }
}
