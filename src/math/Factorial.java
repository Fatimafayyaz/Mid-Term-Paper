package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //iteration method

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:  ");
        long num = scanner.nextLong();
         //calFactorial(num);
        System.out.println("\nfactorial of  " + num + " is " + calFactorial(num));
        System.out.println("\nfactorial of  " + num + " is " + recursiveFactorial(num));
    }

      public static long  calFactorial(long n ) {
          long fact = 1;
          for (long i = n; i >= 1; i--)
              fact = fact * i;
          //System.out.println("\nfactorial of  " + n + " is " + fact);
          return fact;
      }
        //recursion method
       // Scanner scanner1 = new Scanner(System.in);
        //long n1 = 0;
        //System.out.print("Enter any number:  \t");
        //n = scanner.nextLong();
        //System.out.println("Factorial of number : " + n + " is " + recursiveFactorial(n));


    public static long recursiveFactorial(long n) {

        if (n > 1)
            return n * recursiveFactorial(n - 1);
        else
            return 1;

    }


}

