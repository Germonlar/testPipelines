package org.example;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPal(545)); // true
        System.out.println(isPal(1001)); // true
        System.out.println(isPal(123454321)); // false
        System.out.println(isPal(33)); // true
    }

    public static boolean isPal(int num) {
        int copy = num;
        int rev =0;
        int rightMost;

        while (num>0){
            rightMost = num % 10;

            rev = (rev*10) + rightMost;

            num= num /10;
        }

        return copy == rev;
    }

}



