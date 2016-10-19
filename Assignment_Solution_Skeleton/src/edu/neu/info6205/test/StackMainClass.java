/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Stack;

/**
 *
 * @author ngmodani
 */
public class StackMainClass {
    
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(0);
        s.push(1);
        s.push(2);
        System.out.println("Peek : "+s.peek());
        System.out.println("Pop : "+s.pop());
        System.out.println("Peek : "+s.peek());
       s.getStackList().display();
    }
    
}
