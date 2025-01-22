package org.example;

public class RemoveDuplicatesFromStr {

    public static void main(String[] args) {
        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("applep")); // aple
        System.out.println(removeDup("aaaaaa")); // a
        System.out.println(removeDup("abc")); // abc
    }

    public static String removeDup(String str) {
        StringBuilder noDuWord = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!noDuWord.toString().contains(String.valueOf(ch))){
                noDuWord.append(ch);
            }
        }
        return noDuWord.toString();
    }

}
