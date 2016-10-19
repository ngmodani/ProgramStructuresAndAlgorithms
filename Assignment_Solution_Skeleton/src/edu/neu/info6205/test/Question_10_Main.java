/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question10;

/**
 *
 * @author ngmodani
 */
public class Question_10_Main {

    public static void main(String[] args) {
        String str = "{()}";
        Question10 q = new Question10();
        System.out.println("Balanced : "+q.solve(str));

    }
}
