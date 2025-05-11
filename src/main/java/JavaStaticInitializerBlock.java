public class JavaStaticInitializerBlock {
    /* https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
    5-11-25 - Complete.
     */
    import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            int B = scanner.nextInt();
            int H = scanner.nextInt();


            if(B <= 0 || H <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {System.out.println(B * H);
            }
        }
    }
}
