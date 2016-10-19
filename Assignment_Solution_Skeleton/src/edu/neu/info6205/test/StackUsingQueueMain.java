/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.StackUsingQueue;

/**
 *
 * @author ngmodani
 */
public class StackUsingQueueMain {
    
    public static void main(String[] args) {
        StackUsingQueue list = new StackUsingQueue();
        list.push(100);
        list.push(101);
        list.push(102);
        System.out.println("Pop : "+list.pop());
        
        list.display();
        System.out.println("\nsize : "+list.size());
        System.out.println("\nEmpty : "+list.isEmpty());
    }
    
}
