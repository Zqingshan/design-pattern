package com.zqs.test;

import com.zqs.singleton.MySingleTon;
import com.zqs.singleton.MySingleTon2;
import com.zqs.singleton.MySingleTon5;
import com.zqs.singleton.MySingleTon6;
import org.junit.Test;

/**
 * @description:
 * @author: z_qingshan
 * @create: 2021-05-22
 **/
public class MySingletonTest {


    @Test
    public void testSingleTon1() {
        MySingleTon mySingleTon1 = new MySingleTon();
        MySingleTon mySingleTon2 = new MySingleTon();
        MySingleTon mySingleTon3 = new MySingleTon();

        mySingleTon1.method();
    }

    @Test
    public void testSingleTon2() {
        MySingleTon2 instance1 = MySingleTon2.getInstance();
        MySingleTon2 instance2 = MySingleTon2.getInstance();
        MySingleTon2 instance3 = MySingleTon2.getInstance();

    }

    /**
     * 静态内部类中的方法调用
     */
    @Test
    public void testSingleTon3() {
        // 在执行静态内部类中的静态方法之前,执行了静态内部类中的静态代码块
        MySingleTon5.invokeInnerMethod();

        // 运行结果
        // 调用静态内部类中的方法
        // 静态内部类中的静态代码块
        // 静态内部类中的方法
    }

    /**
     * 没有调用静态内部类中的方法
     */
    @Test
    public void testSingleTon4() {
        MySingleTon5.noInvokeInnerMethod();

        // 不调用静态内部类中的方法
    }

    /**
     * 多次调用静态内部类中的方法
     */
    @Test
    public void testSingleTon5(){
        MySingleTon5.invokeInnerMethod();
        MySingleTon5.invokeInnerMethod();
        MySingleTon5.invokeInnerMethod();
        MySingleTon5.invokeInnerMethod();

        // 调用静态内部类中的方法
        // 静态内部类中的静态代码块
        // 静态内部类中的方法
        // 调用静态内部类中的方法
        // 静态内部类中的方法
        // 调用静态内部类中的方法
        // 静态内部类中的方法
        // 调用静态内部类中的方法
        // 静态内部类中的方法
    }

    /**
     * 线程安全的懒加载模式
     */
    @Test
    public void testSingleTon6(){
        MySingleTon6 instance1 = MySingleTon6.getInstance();
        MySingleTon6 instance2 = MySingleTon6.getInstance();
        MySingleTon6 instance3 = MySingleTon6.getInstance();


    }
}
