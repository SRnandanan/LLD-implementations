package com.java.concepts.multithreading;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {

    /**
     * The executor is defined with a custom thread factory which creates the thread for given task
     * And it will also have a custom class to handle rejection
     * */
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3, 5, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2)
                , new CustomThreadFactory(), new CustomRejectionHandler());

        executor.allowCoreThreadTimeOut(true);

        for(int i=0; i<=8; i++){
            executor.submit(()->{
                try {
                    Thread.sleep(4000);
                    System.out.println("Executed thread is: "+ Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.shutdown();

    }

}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("Creating thread for task: "+r.toString());
        return new Thread(r);
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Rejecting task: "+r.toString());
    }
}
