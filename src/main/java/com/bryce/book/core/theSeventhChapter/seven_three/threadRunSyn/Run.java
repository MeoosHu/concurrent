package com.bryce.book.core.theSeventhChapter.seven_three.threadRunSyn;

/**
 * @author huff
 * @date 2020/3/27 0:04
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock,"A",1);
        MyThread b = new MyThread(lock,"B",2);
        MyThread c = new MyThread(lock,"C",0);
        a.start();
        b.start();
        c.start();
    }
}
