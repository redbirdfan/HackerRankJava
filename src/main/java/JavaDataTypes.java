/*public class JavaDataTypes {
}
https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
5-7-25 Not finished, partially working.
5-7-25 Output correct, except last input of 10^13 not reading as a long.
5-8-25 Int changed to Long to handle all numbers.  Also able to take string of numbers now.

 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong();

                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (InputMismatchException e) {
                String input = scanner.next();
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}