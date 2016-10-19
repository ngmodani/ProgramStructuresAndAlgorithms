/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.Interface;

/**
 *
 * @author Muddassar
 */
public class DoubleLinkedListNode {
    
    public int value;
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int val,DoubleLinkedListNode head,DoubleLinkedListNode tail) {
        next=head;
        prev=tail;
        value=val;
    }
    
    
}
