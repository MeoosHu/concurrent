package com.bryce.book.core.theFourthChapter.four_one.MustUseMoreCondition_Error;

/**
 * @author huff
 * @date 2020/3/24 15:05
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
