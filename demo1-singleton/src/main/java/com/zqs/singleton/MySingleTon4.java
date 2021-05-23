package com.zqs.singleton;

/**
 * @description: 线程安全的立即加载单例
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingleTon4 {

    public void method() {
        System.out.println("test");
    }

    // 3.自行提供一个全局变量(静态、私有)
    private static MySingleTon4 mySingleTon4;

    // 4.立即加载，方式二 直接给静态成员变量完成实例化
    // private static MySingleTon4 mySingleTon4 = new MySingleTon4();

    // 4.立即加载，方式一 使用静态代码块
    static {
        mySingleTon4 = new MySingleTon4();
    }

    // 1.构造方法私有化
    private MySingleTon4() {
    }

    // 2.提供一个静态方法来获得实例化
    public synchronized static MySingleTon4 getInstance() {

        return mySingleTon4;
    }
}
