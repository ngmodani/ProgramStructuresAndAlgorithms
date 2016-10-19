/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Queue;

/**
 *
 * @author ngmodani
 */
public class QueueMainClass {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println("Peek : " + q.peek());
        System.out.println("dequeue : " + q.dequeue());
        System.out.println("Peek : " + q.peek());
        q.getQueueList().display();
        System.out.println("dequeue : " + q.dequeue());
        System.out.println("Peek : " + q.peek());
        q.getQueueList().display();
    }

    
}
