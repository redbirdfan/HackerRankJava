public class ValidUserName {
    //first run, check length and 1st number.  Now need to complete check against illegal characters.
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
            String allAcceptable = (lower+upper+notLetters);

            for(int i = 0; i < numNames; i++){
                String name = scanner.next();
                char firstLetter = name.charAt(0);
                String firstChar = Character.toString(firstLetter);
                if(notLetters.contains(firstChar) || name.length() < 8 || name.length() > 30){
                    System.out.println("Invalid");
                }

            }
        }
    }
}
}
