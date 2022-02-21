package com.bryce.book.core.theSecondChapter.two_two.t7;

/**
 * @author huff
 * @date 2020/3/17 16:36
 */
public class MyThread2 extends  Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
