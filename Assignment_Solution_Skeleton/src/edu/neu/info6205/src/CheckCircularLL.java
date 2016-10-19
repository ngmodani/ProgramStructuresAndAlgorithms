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
public class CheckCircularLL {

    public boolean checkCircularLL(Node node) {
        
        if (node == null) {
            return false;
        } else {
            boolean flag = true;
            Node turtle = node;
            Node hare = node;
            do {
                if (hare.next == null || hare.next.next == null) {
                    flag = false;
                    break;
                }
                hare = hare.next.next;
                turtle = turtle.next;
            } while (hare != turtle);
            
            return flag;
        }
    }

}
