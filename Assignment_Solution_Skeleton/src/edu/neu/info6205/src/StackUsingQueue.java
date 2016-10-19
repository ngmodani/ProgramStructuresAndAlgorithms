/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

/**
 *
 * @author ngmodani
 */
public class StackUsingQueue {

    Queue list;

    public StackUsingQueue() {
        list = new Queue();
    }

    public void push(int value) {
        list.enqueue(value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("\nEmpty List.\n");
            return -1;
        } else {
            for(int i=0;i<list.size()-1;i++){
                list.enqueue(list.dequeue());
            }
            return list.dequeue();
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.getQueueList().display();
    }

}
