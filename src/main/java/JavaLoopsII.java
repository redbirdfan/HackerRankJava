public class JavaLoopsII {
    /*problem link https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true//
    5-13-25 still working through
*/
    import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            Integer z = scanner.nextInt();
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();
            Integer n = scanner.nextInt();
            System.out.println(a);

            for (int i = 0; i < z; i++){
                Integer query = (a + 1 * b);
                System.out.println(query);
                for(int j = 1; j < n ; j++){
                    Double exponent = Math.pow(2, i);
                    Double addOnQuery = (exponent * b);
                    Double next = (query)+(addOnQuery);
                }


            }
        }
    }
}