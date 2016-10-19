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
public class StringStack {

    private StringLinkedList stackList;

    public StringStack() {
        stackList = new StringLinkedList();
    }

    public void push(char value) {
        stackList.addNodeAtHead(value);
    }

    public char pop() {
        char popItem = stackList.getHeadNode().val;
        if (stackList.deleteNodeAtPosition(0) == true) {
            return popItem;
        } else {
            return 'x';
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}
