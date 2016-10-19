/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question9;

/**
 *
 * @author ngmodani
 */
public class Question_9_Main {


    public static void main(String[] args) {

        String str = new String("qgjhQ");
        
        Question9 q = new Question9();
        System.out.println("Boolean Array : "+q.hasDuplicates(str));
        System.out.println("Standard : "+q.isUniqueChars(str));
        System.out.println("HashSet : "+q.uniqueChar(str));
        
    }
    
    

   
}