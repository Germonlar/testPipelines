package org.example;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPal("anna")); // true
        System.out.println(isPal("civic")); // true
        System.out.println(isPal("apple")); // false
        System.out.println(isPal("level")); // true
    }

    public static boolean isPal(String str) {
        StringBuilder word = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            word.append(str.charAt(i));
        }
        if(str.equals(word.toString())){
            return true;
        }
        return false;
    }

}
