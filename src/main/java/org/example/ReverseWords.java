package org.example;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    public static String revWords(String str) {
        StringBuilder words = new StringBuilder();

        String [] arr = str.split(" ");

        for(int i = arr.length-1; i >= 0; i--){
            words.append(arr[i]).append(" ");
        }
        return words.toString().trim();
    }
}
