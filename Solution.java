
package com.Babatunde;

import java.io.*;
import java.util.*;

public class Solution {
    private String A;
    private String B;
    private int result = 0;


    public void countWord ( String A1, String B2){

        /**
         * Changes the first letter of the word to an upper case.
         */
        String A = A1.substring(0, 1).toUpperCase() + A1.substring(1);
        String B = B2.substring(0, 1).toUpperCase() + B2.substring(1);


        /**
         * Get the first character(i) of the string and store as sortA and sortB respectively.
         */
        String sortA = A1.substring(0, 1).toUpperCase();
        String sortB = B2.substring(0, 1).toUpperCase();

        int  sample = A1.compareTo(B2);



        /**
         * Splits each character of the string_word into the array
         */
        String[] length_A = A.split(" ");
        String[] length_B = B.split(" ");


// 

        /**
         * Loops through the array and get the number of characters(the length of the array) in the string.
         */
        for(String  numA : length_A ) {
            //System.out.println(numA + " length is: " + numA.length());
            int testA = numA.length();
            //System.out.println(testA); //-----------------test print


            for (String numB : length_B) {
                //System.out.println(numB + " length is: " + numB.length());
                int testB = numB.length();
                //System.out.println(testB); //--------------------test print

                /**
                 * Calculate the total numbers of words and store it in the result.
                 */
                result = testA + testB;
                System.out.println(result);


                /**
                 * check if the
                 */
                if( sample > 0 ) {

                    System.out.println("Yes");

                } else {
                    System.out.println("No");
                }
                System.out.println(A + " " + B);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        Solution test = new Solution();
        test.countWord(A,B);

    }
}
