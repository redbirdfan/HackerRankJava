public class JavaEndOfFile {
/*
https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
5-10-25 Started and completed.
 */


    import java.io.*;
    import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here;*/

            Scanner scanner = new Scanner(System.in);
            Integer i = 0;

            while(scanner.hasNext()){
                String line = scanner.nextLine();
                if (line.length() > 0) {
                    i++;
                    System.out.println(i + " " + line);

                }

            }
        }
    }
}
