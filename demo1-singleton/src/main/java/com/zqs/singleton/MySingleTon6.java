package com.zqs.singleton;

/**
 * @description: 线程安全的懒加载单例 静态内部类
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingleTon6 {
    // 1.私有化构造方法
    private MySingleTon6() {
    }

    // 2.提供示例
    private static MySingleTon6 mySingleTon6;

    // 3.静态内部类
    static class Inner {
        // 静态内部类的静态代码块，在第一次调用静态代码块之前执行一次
        // 实例化的过程放在静态代码块
        static {
            mySingleTon6 = new MySingleTon6();
        }

        public static MySingleTon6 getInnerInstance() {
            return mySingleTon6;
        }
    }

    // 4. 调用静态内部类中的方法
    public static MySingleTon6 getInstance() {
        return Inner.getInnerInstance();
    }
}
