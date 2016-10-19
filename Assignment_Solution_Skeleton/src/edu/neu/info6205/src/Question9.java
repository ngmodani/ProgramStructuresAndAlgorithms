/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import java.util.HashSet;

/**
 *
 * @author Muddassar
 */
public class Question9 {

    public boolean solve(String input) {
        //TODO: implement logic
        return false;
    }

    //standard solution with space {O(1)} & time {O(n)} 
    public boolean isUniqueChars(String str) {
        if (str.length() > 256) {
            // possible ASCII codes are from 0-255.  source : http://www.asciitable.com
            //if length is more than 255 means at least one character is repeated.
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.toLowerCase().charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                //left shift 1 by val and then AND with checker
                return false;
                /*If the bit at position val in checker is already set, then this 
                 evaluates to a nonzero value (meaning we've already seen the number)
                 and we can return false. Otherwise, it evaluates to 0, and we haven't
                 seen the number.*/
            }
            checker |= (1 << val);
            //bitwise OR with assignment i.e.  checker = checker | (1 << val);
        }
        return true;
    }

    //another solution with same time complexity{O(n)} but higher Space complexity {O(n)}
    public boolean hasDuplicates(String word) {

        boolean[] check = new boolean[26]; // 26 english alphabets
        for (int i = 0; i < word.length(); i++) {
      // int value of 'a' is 97. By subtracting this number we find array index      
            //starting from 0 to 26
            int pos = word.toLowerCase().charAt(i) - 'a';
            if (check[pos]) {
                return false;
            } else {
                check[pos] = true;
            }
        }
        return true;
    }

    // space {O(n)} and time complexity {O(n)} is high
    public boolean uniqueChar(String str) {
        HashSet<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            unique.add(str.toLowerCase().charAt(i));
        }
        if (unique.size() != str.length()) {
            return false;
        }
        return true;
    }

}
