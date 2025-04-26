package com.java.concepts.multithreading;

public class MonitorLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(6);
        Thread producer = new Thread(()->{
            for(int i=0; i<6; i++){
                try {
                    resource.produce(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(()->{
            for(int i=0; i<6; i++){
                try{
                    resource.consume();
                } catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
