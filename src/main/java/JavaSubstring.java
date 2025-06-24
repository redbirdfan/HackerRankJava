public class JavaSubstring {
}

//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

//6-23-25 working correctly, except the first and last index are being returned as arrays.
//6-24-35 Correction made by using index methods for lists.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        int b = scanner.nextInt();
        ArrayList<String> subArray = new ArrayList<String>();

        for (int i=0 ; i < a.length()-b+1 ; i++){
            String cutString = a.substring(i, i+b);
            subArray.add(cutString);
        }

        Collections.sort(subArray);
        int listlength = subArray.size();
        int endList = listlength-1;
        String firstList = subArray.get(0);
        String lastList = subArray.get(endList);
        System.out.println(firstList);
        System.out.println(lastList);
    }
}


