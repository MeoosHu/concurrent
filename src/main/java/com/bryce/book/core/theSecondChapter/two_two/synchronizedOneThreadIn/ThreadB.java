package com.bryce.book.core.theSecondChapter.two_two.synchronizedOneThreadIn;

/**
 * @author huff
 * @date 2020/3/17 16:20
 */
public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
