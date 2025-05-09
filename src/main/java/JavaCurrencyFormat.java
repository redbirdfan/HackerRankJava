public class JavaCurrencyFormat {
    /* https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
    5-8-25 - looked up format syntax and direction.  Syntax seems to be at issue.  Will research further and complete tomorrow.
    5-9-25 - Get instance was incorrect.  new to use numberformat with the locale and then pass payment to it

    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            Locale usa = new Locale("en", "US");
            Locale france = new Locale("fr", "FR");
            Locale china = new Locale("zh", "CN");
            Locale india = new Locale("en", "IN");

            Currency usCurrency = Currency.getInstance(usa);
            Currency fraCurrency = Currency.getInstance(france);
            Currency chiCurrency = Currency.getInstance(china);
            Currency indiaCurrency = Currency.getInstance(india);

            System.out.println("US: " + Currency.getInstance(usCurrency));
            System.out.println("India: " + Currency.getInstance(indiaCurrency));
            System.out.println("China: " + Currency.getInstance(chiCurrency));
            System.out.println("France: " + Currency.getInstance(fraCurrency));
        }
    }
}*/

Correct code:
            import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            Locale usa = new Locale("en", "US");
            Locale france = new Locale("fr", "FR");
            Locale china = new Locale("zh", "CN");
            Locale india = new Locale("en", "IN");

            NumberFormat usd = NumberFormat.getCurrencyInstance(usa);
            NumberFormat fre = NumberFormat.getCurrencyInstance(france);
            NumberFormat chi = NumberFormat.getCurrencyInstance(china);
            NumberFormat ind = NumberFormat.getCurrencyInstance(india);

            System.out.println("US: " + usd.format(payment));
            System.out.println("India: " + ind.format(payment));
            System.out.println("China: " + chi.format(payment));
            System.out.println("France: " + fre.format(payment));
        }
    }

