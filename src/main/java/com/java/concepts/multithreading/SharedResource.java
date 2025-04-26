package com.java.concepts.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    public Queue<Integer> queue;
    public int bufferSize;

    public SharedResource(int bufferSize){
        queue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int data){
        //we have to check if the queue is full or not
        try{
            while(queue.size()==bufferSize){
                System.out.println("Queue is already full..going to wait");
                wait();
            }
        } catch(Exception e){
            throw new RuntimeException("Exception occurred at runtime during produce!");
        }
        queue.add(data);
        System.out.println("Data "+data+" has been produced");
        notify();
    }

    public synchronized void consume(){
        try{
            while(queue.isEmpty()){
                System.out.println("Queue is empty...going to wait");
                wait();
            }
        } catch(Exception e){
            throw new RuntimeException("Exception occured at runtime during consume!");
        }
        int val = queue.poll();
        System.out.println("Data "+val+" has been consumed");
        notify();
    }
}
