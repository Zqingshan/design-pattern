package com.zqs.singleton;

/**
 * @description: 线程安全的懒加载单例  静态内部类
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingleTon5 {
    // 调用静态内部类中的方法
    public static void invokeInnerMethod() {
        System.out.println("调用静态内部类中的方法");
        Inner.innerMethod();
    }

    // 不调用静态内部类中的方法
    public static void noInvokeInnerMethod() {
        System.out.println("不调用静态内部类中的方法");
    }

    static class Inner {
        static {
            System.out.println("静态内部类中的静态代码块");
        }

        public static void innerMethod() {
            System.out.println("静态内部类中的方法");
        }
    }
}
