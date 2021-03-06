package com.bryce.book.core.theSecondChapter.two_three.t10;

/**
 * @author huff
 * @date 2020/3/18 17:12
 */

public class PrintString implements Runnable{
    private boolean isContinuePrint=true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod(){
        try {
            while (isContinuePrint==true){
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
