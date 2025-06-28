public class ValidUserName {
    //first run, check length and 1st number.  Now need to complete check against illegal characters.
    //reading as should for valid and invalid.  @ system in an username seems to be tripping it up.
    //Now able to get starting character _ to read as invalid or the @ symbol in the name to read invalid
    //but not both.

import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);

            int numNames = scanner.nextInt();

            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = lower.toUpperCase();
            String notLetters = "0123456789_";
            String firstLetterAcceptable = lower + upper;
            String allAcceptable = (lower+upper+notLetters);
            String unacceptable = "!@#$%)(*&^,./;'][=+|:<>?";

            for(int i = 0; i < numNames; i++){

                String name = scanner.next();
                char[] nameCharArray = name.toCharArray();
                char firstLetter = name.charAt(0);

                String firstChar = Character.toString(firstLetter);
                ArrayList<String> nameArray = new ArrayList<String>();

                for(int j = 0 ; j < name.length(); j++){
                    char c = name.charAt(j);
                    String c2 = Character.toString(c);
                    if(unacceptable.contains(c2)){
                        System.out.println("Invalid");
                    }
                    nameArray.add(c2);
                }




                if(name.length() < 8 || name.length() > 30){
                    System.out.println("Invalid");
                } else if(!firstLetterAcceptable.contains(firstChar) || unacceptable.contains(firstChar)){
                    System.out.println("Invalid");

                } else {
                    System.out.println("Valid");
                }

            }
        }

    }