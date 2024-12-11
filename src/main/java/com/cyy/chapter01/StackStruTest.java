package com.cyy.chapter01;

import java.util.concurrent.TimeUnit;

/**
 * @program: jvm
 * @description:
 * @author: cyy
 * @create: 2024-12-11 20:54
 * 通过javap -v 反编译
 *  0: iconst_2
 *  1: istore_1
 *  2: iconst_3
 *  3: istore_2
 *  4: iload_1
 *  5: iload_2
 *  6: iadd
 *  7: istore_3
 *  8: return
 **/
public class StackStruTest {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = i + j;
        try {TimeUnit.SECONDS.sleep(6);} catch (InterruptedException e) {throw new RuntimeException(e);}
        System.out.println(Thread.currentThread().getName());
    }
}
