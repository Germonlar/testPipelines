package org.example;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPal(545)); // true
        System.out.println(isPal(1001)); // true
        System.out.println(isPal(123454321)); // false
        System.out.println(isPal(33)); // true
    }

    public static boolean isPal(int num) {

        String numeroEnTexto = String.valueOf(num);
        int i = 0;
        int j = numeroEnTexto.length() - 1;

        while (i < j) {
            if(numeroEnTexto.charAt(i) != numeroEnTexto.charAt(j));
            return false;

        }
         ++i;
         --j;

        return true;
    }
}



