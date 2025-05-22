public class JavaLoopsII {
    /*problem link https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true//
    5-13-25 still working through
    5-16-25 First 2 test cases are passing.  3, 4, and 5 are not.  Will have to continue to work through.
    5-21-25 I was reading that the loop involved an exponent and I was super wrong.  Was messing every total up as a result
            Made it more difficult that it was.  We are complete, correct answer listed.
     */

import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            int z = scanner.nextInt();

            for (int i = 0; i < z; i++){

                int a = scanner.nextInt();

                int b = scanner.nextInt();

                int n = scanner.nextInt();

                a = a + 1 * b;



                for(int j = 0; j < n ; j++){
                    System.out.print(a + " ");
                    b = 2 * b;
                    a = a + b;

                    if(j == n-1){
                        System.out.println();
                    }

                }
            }
        }
    }

