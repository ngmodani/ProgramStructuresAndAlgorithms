/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.ILinkedList;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class LinkedList implements ILinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    @Override
    public int size() {
        int len = 0;
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                len++;
                temp = temp.next;
            }
        }
        return len;

    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addNodeAtHead(int value) {
        head = new Node(value, head);
    }

    @Override
    public void addNodeAtTail(int value) {

        if (head == null) {
            addNodeAtHead(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }   
            temp.next = new Node(value, null);
        }
    }

    @Override
    public void addNodeAtPosition(int value, int position) {// what if position = 0
        if (position == 0) {
            addNodeAtHead(value);
        } else {
            if (head == null) {
                System.out.println("Empty List.");
            } else {
                Node temp = head;
                int k = 0;
                while (temp != null && k < position) {
                    temp = temp.next;
                    k++;
                }
                if (temp != null) {
                    temp.next = new Node(value, temp.next);
                } else {
                    System.out.println("This position not available in List.");
                }
            }
        }
    }

    @Override
    public Node reverseALinkList(Node node) {   //assuming input is head of Linked List
        LinkedList reversedLL = new LinkedList();
        Node temp = node;
        while (temp != null) {
            reversedLL.addNodeAtHead(temp.value);
            temp = temp.next;
        }
        return reversedLL.head;                 //output ll be head of reversed Lnked List
    }

    @Override
    public Node getHeadNode() {
        return head;
    }

    @Override
    public Node getTailNode() {
        if (head == null) {
            System.out.println("Empty List");
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp;
        }
    }

    @Override
    public boolean deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("Empty List.");
            return false;
        } else {
            if (position == 0) {
                Node temp = head;
                head = head.next;
                temp.next=null;
                //System.out.println("This position deleted in List.");
                return true;
                //head=null;
            } else {
                Node cur = head;
                Node prev = null;
                int k = 0;
                while (cur != null && k < position) {
                    prev = cur;
                    cur = cur.next;
                    k++;
                }
                if (cur != null) {
                    prev.next = cur.next;
                    cur.next = null;
                    //System.out.println("This position deleted in List.");
                    return true;
                } else {
                    System.out.println("This position not available in List.");
                    return false;
                }
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
