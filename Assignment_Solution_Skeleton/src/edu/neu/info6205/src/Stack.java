/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IStack;

/**
 *
 * @author Muddassar
 */
public class Stack implements IStack {
    
    private LinkedList stackList;
    
    public Stack() {
        stackList = new LinkedList();
    }
    
    @Override
    public void push(int value) {
        stackList.addNodeAtHead(value);
    }
    
    @Override
    public int pop() {
        int popItem = stackList.getHeadNode().value;
        if(stackList.deleteNodeAtPosition(0)==true){
            return popItem;
        }else
            return -1;
    }
    
    @Override
    public int peek() {
        return stackList.getHeadNode().value;
    }
    
    @Override
    public int size() {
        return stackList.size();
    }
    
    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public LinkedList getStackList() {
        return stackList;
    }
    
    
    
}
