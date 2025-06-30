public class ValidUserName {
    //first run, check length and 1st number.  Now need to complete check against illegal characters.
    //reading as should for valid and invalid.  @ system in an username seems to be tripping it up.
    //Now able to get starting character _ to read as invalid or the @ symbol in the name to read invalid
    //but not both.
    //Created a validUser boolean to give each validation a trigger.  got all but 1 test to pass, needed to use nextLine()
    //instead of just next() to ensure full longer usernames were being being fully acceptable to check.
    // complete 6-29-25


import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);

            int numNames = scanner.nextInt();
            scanner.nextLine();

            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = lower.toUpperCase();
            String notLetters = "0123456789_";
            String firstLetterAcceptable = lower + upper;
            String allAcceptable = (lower+upper+notLetters);

            for(int a = 1; a < numNames+1; a++){
                Boolean validUser = true;
                String name = scanner.nextLine();

                if(name.length()< 8 || name.length() > 30){
                    validUser = false;
                }

                if(name.length()>0 && !firstLetterAcceptable.contains(name.substring(0,1))){
                    validUser = false;
                }

                if(validUser){
                    for(int i = 0 ; i < name.length(); i++){
                        String nameLetter = name.substring(i, i+1);
                        if(!allAcceptable.contains(nameLetter)){
                            validUser = false;
                            break;
                        }
                    }
                }


                if(validUser == true){
                    System.out.println("Valid");
                }else{
                    System.out.println("Invalid");
                }
            }
        }
    }
