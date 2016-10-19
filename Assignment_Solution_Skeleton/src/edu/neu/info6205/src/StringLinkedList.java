/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.Node;

/**
 *
 * @author ngmodani
 */
public class StringLinkedList {

    private Node head;

    public StringLinkedList() {
        head = null;
    }

    public int size() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addNodeAtHead(char value) {
        head = new Node(value, head);
    }

    public Node getHeadNode() {
        return head;
    }

    public boolean deleteNodeAtPosition(int position) {
        if (head == null) {
            //System.out.println("Empty List.");
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
                   // System.out.println("This position not available in List.");
                    return false;
                }
            }
        }
    }

}
