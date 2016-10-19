/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.QueueUsingStack;

/**
 *
 * @author ngmodani
 */
public class QueueUsingStackMain {

    public static void main(String[] args) {
        QueueUsingStack s = new QueueUsingStack();

        s.enqueue(10);
        s.enqueue(11);
        System.out.println("dequeue : " + s.dequeue());
        s.enqueue(12);
        s.enqueue(13);
        s.enqueue(14);
        //System.out.println("Peek : "+s.peek());

        System.out.println("dequeue : " + s.dequeue());
        //System.out.println("Peek : "+s.peek());
        s.display();
    }

}
