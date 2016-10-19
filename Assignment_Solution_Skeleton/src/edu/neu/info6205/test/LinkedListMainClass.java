/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.Interface.Node;
import edu.neu.info6205.src.CheckCircularLL;
import edu.neu.info6205.src.LinkedList;

/**
 *
 * @author ngmodani
 */
public class LinkedListMainClass {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeAtHead(1);
        list.addNodeAtTail(2);
        list.addNodeAtTail(3);
        list.addNodeAtTail(4);
        list.addNodeAtHead(0);
        list.addNodeAtPosition(5, 4);
       list.deleteNodeAtPosition(2);
       System.out.println("Head Node : "+list.getHeadNode().value);
               System.out.println("Tail Node : "+list.getTailNode().value);
        list.display();
        
        System.out.println("\n----CheckCircularLL--------");
        CheckCircularLL check = new CheckCircularLL();
        System.out.println("\nCircular Link List ? "+check.checkCircularLL(list.getHeadNode()));
        
        System.out.println("\n---Reverse---------");
        Node revreseHeadNode = list.reverseALinkList(list.getHeadNode());
        while (revreseHeadNode != null) {
            System.out.print(revreseHeadNode.value + "-->");
            revreseHeadNode = revreseHeadNode.next;
        }
    }

}
