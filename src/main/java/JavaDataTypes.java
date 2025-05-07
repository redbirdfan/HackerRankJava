/*public class JavaDataTypes {
}
https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
5-7-25 Not finished, partially working.
5-8-25 Output correct, except last input of 10^13 not reading as a long.

 */
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {

        Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();

        for (int i = 0; i < T; i++){
            try{
                Integer n  = scanner.nextInt();

                System.out.println(n + " can be fitted in:");

                if(n >= -128 && n <= 127){
                    System.out.println("* byte");
                }

                if(n >= -32768 && n <= 32767){
                    System.out.println("* short");
                }

                if(n >= -2147483648 && n <= 2147483647){
                    System.out.println("* int");
                }

                if(n > Math.pow(-2, 63) && n < ((Math.pow(2, 63))-1)){
                    System.out.println("* long");
                }
            }  catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
