public class JavaLoopsII {
    /*problem link https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true//
    5-13-25 still working through
    5-16-25 First 2 test cases are passing.  3, 4, and 5 are not.  Will have to continue to work through.
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
                int power = 0;
                int total = (int) (a + Math.pow(2, power) * b);
                System.out.print(total + " ");

                for(int j = 1; j < n ; j++){

                    power = j;

                    int addOn = (int) Math.pow(2, power) * b;
                    total = (total + addOn);
                    System.out.print(total+ " ");

                    if(j == n-1){
                        System.out.println();
                    }

                }
            }
        }
    }
