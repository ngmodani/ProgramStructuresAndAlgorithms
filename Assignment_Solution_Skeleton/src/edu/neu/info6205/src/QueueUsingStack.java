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
public class QueueUsingStack {

    Stack list1;
    Stack list2;

    public QueueUsingStack() {
        list1 = new Stack();
        list2 = new Stack();
    }

    public void enqueue(int value) {

        list1.push(value);
    }

    public int dequeue() {
        if (list1.isEmpty() && list2.isEmpty()) {
            return -1;
        } else {
            if (list2.isEmpty()) {
                while (!list1.isEmpty()) {
                    list2.push(list1.pop());
                }
            }
            int delItem = list2.pop();
            if (list1.isEmpty()) {
                while (!list2.isEmpty()) {
                    list1.push(list2.pop());
                }
            }
            return delItem;
        }
    }

    public boolean isEmpty() {
        return list1.isEmpty();
    }

    public int size() {
        return list1.size();
    }

    public void display() {
        list1.getStackList().display();
    }

}

/*
 using recusrion

 public class SimulatedQueue<E> {
 private java.util.Stack<E> stack = new java.util.Stack<E>();

 public void insert(E elem) {
 if (!stack.empty()) {
 E topElem = stack.pop();
 insert(elem);
 stack.push(topElem);
 }
 else
 stack.push(elem);
 }

 public E remove() {
 return stack.pop();
 }
 }

 */
