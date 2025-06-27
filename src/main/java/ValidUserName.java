public class ValidUserName {
    //first run, check length and 1st number.  Now need to complete check against illegal characters.
    //reading as should for valid and invalid.  @ system in an username seems to be tripping it up.

import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);

            int numNames = scanner.nextInt();
            System.out.println(numNames);

            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = lower.toUpperCase();
            String notLetters = "0123456789_";
            String firstLetterAcceptable = lower + upper;
            String allAcceptable = (lower+upper+notLetters);

            for(int i = 0; i < numNames; i++){
                String name = scanner.next();
                char firstLetter = name.charAt(0);
                String firstChar = Character.toString(firstLetter);

                for(char c : name.toCharArray()){
                    String c2 = Character.toString(c);
                    if(!allAcceptable.contains(c2)){
                        System.out.println("Invalid");
                        break;
                    }
                }

                if(name.length() < 8 || name.length() > 30){
                    System.out.println("Invalid");
                } else if(!firstLetterAcceptable.contains(firstChar)){
                    System.out.println("Invalid");
                } else {
                    System.out.println("Valid");
                }

            }


        }
    }