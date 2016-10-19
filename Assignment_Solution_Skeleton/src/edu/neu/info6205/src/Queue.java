/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IQueue;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class Queue implements IQueue {

    LinkedList queueList ;//= new LinkedList();
    Node first, last;
    int len;

    public Queue() {
        queueList = new LinkedList();
        first = null;
        last = null;
        len = -1;
    }

    @Override
    public void enqueue(int value) {
        if (queueList.isEmpty()) {
            queueList.addNodeAtHead(value);
            first = queueList.getHeadNode();
            last = queueList.getHeadNode();

        } else {
            queueList.addNodeAtHead(value);
            last = queueList.getHeadNode();

        }
        len++;
    }

    @Override
    public int dequeue() {
        if (queueList.isEmpty()) {
            System.out.println("\nEmpty List.\n");
            return -1;
        } else {
            int itemDequeue = first.value;
            queueList.deleteNodeAtPosition(len);
            first = queueList.getTailNode();
            len--;
            return itemDequeue;
        }
    }

    @Override
    public int peek() {
        return first.value;
    }

    @Override
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    @Override
    public int size() {
        return len+1;
    }

    public LinkedList getQueueList() {
        return queueList;
    }

}
