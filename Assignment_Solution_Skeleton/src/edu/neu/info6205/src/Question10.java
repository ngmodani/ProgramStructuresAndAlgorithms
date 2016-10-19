/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

/**
 *
 * @author Muddassar
 */
public class Question10 {

    public boolean solve(String input) {

        StringStack list = new StringStack();
        boolean flag = true;
        if (input.length() % 2 == 0 && input.length()>0) {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                switch (ch) {
                    case '{':
                    case '[':
                    case '(':
                        list.push(ch);
                        break;
                    case '}':
                        if (list.isEmpty() || list.pop() !='{') {
                            flag = false;
                        }
                            break;
                        
                    case ']':
                        if (list.isEmpty() || list.pop() != '[') {
                            flag = false;}
                            break;
                        
                    case ')':
                        if (list.isEmpty() || list.pop() != '(') {
                            flag = false;}
                            break;
                        
                    default:System.out.println("default");
                        flag = false;
                        
                }

            }if(!list.isEmpty()){
                flag = false;
            }
            return flag;
        } else {
            return false;
        }
    }

}
