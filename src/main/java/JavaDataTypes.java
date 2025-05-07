/*public class JavaDataTypes {
}
https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
Not finished, partially working.
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
                Integer n = scanner.nextInt();

                if(T < Math.pow(-2, 63) && T > ((Math.pow(2, 63))-1)){
                    System.out.println(T +" can't be fitted anywhere");
                } else {
                    System.out.println(T + " can betted in:");
                }

                if(T >= -128 && T <= 127){
                    System.out.println("* byte");
                }

                if(T >= -32768 && T <= 32767){
                    System.out.println("* short");
                }

                if(T >= -2147483648 && T <= 2147483647){
                    System.out.println("* int");
                }

                if(T >= Math.pow(-2, 63) && T <= ((Math.pow(2, 63))-1)){
                    System.out.println("* long");
                }
            }  catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
    }
}


