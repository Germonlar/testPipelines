package org.example;

public class StringReverse {

    public static void main(String[] args) {

        char[] arreglo = reverseWord("Mariano");

        for(char i : arreglo){
            System.out.print(i);
        }

    }
        public static char[] reverseWord(String str){
            StringBuilder word = new StringBuilder();
            for(int i = str.length()-1 ; i>=0; i--){
                word.append(str.charAt(i));


            }

            return word.toString().toCharArray();
        }






}


