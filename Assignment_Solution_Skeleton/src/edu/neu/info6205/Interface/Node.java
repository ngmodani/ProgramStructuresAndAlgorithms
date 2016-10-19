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
public class Node {

    public int value;
    public char val;
    public Node next;

    public Node(int val, Node n) {
        value = val;
        next = n;
    }

    public Node(char val, Node n) {
        this.val = val;
        next = n;
    }

}
