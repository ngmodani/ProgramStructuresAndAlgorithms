/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.Interface.DoubleLinkedListNode;
import edu.neu.info6205.src.DoubleLinkedList;

/**
 *
 * @author ngmodani
 */
public class DLLMainClass {

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNodeAtTail(-1);
        list.addNodeAtHead(1);
        list.addNodeAtTail(2);
        list.addNodeAtTail(3);
        list.addNodeAtTail(4);
        list.addNodeAtHead(0);
        list.addNodeAtPosition(5, 4);
        list.deleteNodeAtPosition(-1);
        System.out.println("Head Node : " + list.getHeadNode().value);
        System.out.println("Tail Node : " + list.getTailNode().value);
        list.display();
        System.out.println("\n**************************************\n");
        
        DoubleLinkedListNode revreseHeadNode = list.reverseALinkList(list.getHeadNode());
        System.out.print("null");
        while (revreseHeadNode != null) {
            System.out.print("<-- "+revreseHeadNode.value + " -->");
            revreseHeadNode = revreseHeadNode.next;
        }
        System.out.print("null");

    }
}
