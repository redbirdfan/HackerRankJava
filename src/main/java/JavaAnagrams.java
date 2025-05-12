public class JavaAnagrams {
    /* 5-12-25 Problem complete.  Hurdle was comparinng arrays.  Needed built in method Arrays.equals(a, b)
    https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=false
     */

    import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String a = scanner.nextLine().toLowerCase();
            String b = scanner.nextLine().toLowerCase();

            char a2[] = a.toLowerCase().toCharArray();

            char b2[]= b.toLowerCase().toCharArray();

            Arrays.sort(a2);

            Arrays.sort(b2);

            if(Arrays.equals(a2, b2)){
                System.out.println("Anagrams");
            }else {
                System.out.println("Not Anagrams");
            }
        }
    }
}
