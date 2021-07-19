package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
    Scanner scanner;

    //scanner class object initialised
    public Utility() {
        scanner = new Scanner(System.in);
    }

    /*purpose - to get input of integer value
     * */
    public int getIntValue() {

        return scanner.nextInt();
    }

    /*purpose - to get input of double value
     * */
    public Double getDouble() {
        return scanner.nextDouble();
    }

    /*purpose - to get input of boolean value
     * */
    public Boolean getBoolean() {
        return scanner.nextBoolean();
    }

    /*purpose - to get input of character value
     * */
    public char getCharValue() {
        return scanner.next().charAt(0);    //  next() function returns the next word in the input & charAt(0) function returns the first character in that string
    }
    
    /*purpose - To return fibonacci series
    called - FibonacciSeries
    * */
    public void fibonacciSeries(int upToSum, int firstNumber, int secondNumber) {
        System.out.println("Fibonacci Series Upto " + upToSum + ": ");
        while (firstNumber <= upToSum) {
            System.out.print(firstNumber + ", ");
            int temp = firstNumber;
            firstNumber = secondNumber;
            int updatedNumber = firstNumber + secondNumber;
            secondNumber = updatedNumber;
        }
    }
    
    /*purpose - to check number is perfect number
    called in - PerfectNumber program
    * */
    public void perfectNumberCheck(int perfectCheck) {
        int i, Sum = 0;                   // sum is for checking addition of previous n numbers is eaual to the input number.
        for (i = 1; i < perfectCheck; i++) {
            if (perfectCheck % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == perfectCheck) {
            System.out.format("\n% d is a Perfect Number", perfectCheck);
        } else {
            System.out.format("\n% d is NOT a Perfect Number", perfectCheck);
        }
    }
    

/*purpose - To check the numPrimeCheck is a prime number.
called in - PrimeNumber program
* */
public void primeNumberCheck(int numPrimeCheck) {
    int i, halfCondition = 0, flag = 0;
    halfCondition = numPrimeCheck / 2;
    if (numPrimeCheck == 0 || numPrimeCheck == 1) {
        System.out.println(numPrimeCheck + " is not prime number");
    } else {
        for (i = 2; i <= halfCondition; i++) {
            if (numPrimeCheck % i == 0) {
                System.out.println(numPrimeCheck + " is not prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(numPrimeCheck + " is prime number.");
        }
    }
}

/*purpose - to reverse the number
 * called in - ReverseANumber
 * */
public void reverseTheNumber(int numToReverse) {
    int reversedNum = 0;
    while (numToReverse != 0) {
        int remenderDigit = numToReverse % 10;
        reversedNum = reversedNum * 10 + remenderDigit;
        numToReverse /= 10;
    }

    System.out.println("Reversed Number: " + reversedNum);
}

//purpose - Coupon Number
public static void getCouponNumber(int[] couponArray, int numberOfCoupons) {
    for (int i = 0; i < numberOfCoupons; i++) {
        couponArray[i] = (int) (Math.random() * 1000);   //new number is gnerated and stored in array
        for (int j = 0; j < i; j++) {
            if (couponArray[j] == couponArray[i]) {         //checks if coupon number is repeated
                i = (i - 1);
            }
        }
        System.out.println(i + 1 + ":: Coupon number value is ::" + couponArray[i]);
    }
}
}
