/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.DoubleLinkedListNode;
import edu.neu.info6205.Interface.IDoubleLinkedList;

/**
 *
 * @author Muddassar
 */
public class DoubleLinkedList implements IDoubleLinkedList {

    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;
    int len;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        len = -1;
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addNodeAtHead(int value) {
        if (isEmpty()) {
            head = new DoubleLinkedListNode(value, null, null);
            tail = head;
        } else {
            head.prev = new DoubleLinkedListNode(value, head, null);
            head = head.prev;
        }
        len++;
    }

    @Override
    public void addNodeAtTail(int value) {
        if (isEmpty()) {
            addNodeAtHead(value);
        } else {
            tail.next=new DoubleLinkedListNode(value, null, tail);
            tail=tail.next;
        }
        len++;
    }

    @Override
    public void addNodeAtPosition(int value, int position) {
        if (position > len) {
            System.out.println("This Position not available.");
        } else if (position == 0) {
            addNodeAtHead(value);
        } else if (position == len) {
            addNodeAtTail(value);
        } else {
            DoubleLinkedListNode temp = head;
            int t = 1;
            while (t < position) {
                t++;
                temp = temp.next;
            }
            DoubleLinkedListNode nItem = new DoubleLinkedListNode(value, temp.next, temp);
            temp.next.prev = nItem;
            temp.next = nItem;
            len++;
        }

    }

    @Override
    public DoubleLinkedListNode reverseALinkList(DoubleLinkedListNode node) {
         //assuming input is head of Linked List
        DoubleLinkedList reversedDLL = new DoubleLinkedList();
        DoubleLinkedListNode temp = node;
        while(temp!=null){
            reversedDLL.addNodeAtHead(temp.value);
            temp=temp.next;
        }
        return reversedDLL.head;  
        //output ll be head of reversed Lnked List
    
    }

    @Override
    public DoubleLinkedListNode getHeadNode() {
        return head;
    }

    @Override
    public DoubleLinkedListNode getTailNode() {
        return tail;
    }

    @Override
    public boolean deleteNodeAtPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return false;
        } else {
            if (position > len || position<0) {
                System.out.println("This Position not available.");
                return false;
            } else if (position == 0) {
                DoubleLinkedListNode temp = head;
                head = head.next;
                head.prev = null;
                temp.next = null;
                temp.prev = null;
                len--;
                return true;
            } else if (position == len) {
                DoubleLinkedListNode temp = tail;
                tail = tail.prev;
                tail.next = null;
                temp.next = null;
                temp.prev = null;
                len--;
                return true;
            } else {
                int t = 0;
                DoubleLinkedListNode temp = head;
                while (t < position) {
                    temp = temp.next;
                    t++;
                }
                DoubleLinkedListNode cur = temp;
                temp.prev.next = cur.next;
                temp.next.prev = cur.prev;
                cur.next = null;
                cur.prev = null;
                len--;
                return true;
            }
        }

    }
    
    public void display(){
        DoubleLinkedListNode temp = head;
        System.out.print("null ");
        while(temp!=null){
            System.out.print("<-- "+temp.value+" -->");
            temp=temp.next;
        }
        System.out.print(" null");
    }
}
