package org.example;

import java.util.Arrays;

public class TwoStringAnagram {

    public static void main(String[] args) {
//        System.out.println(isAnagram("listen", "silent")); // true
//        System.out.println(isAnagram("triangle", "integral")); // true
//        System.out.println(isAnagram("abc", "bca")); // true
        System.out.println(isAnagram("abc", "ccb")); // false
        System.out.println(isAnagram("aaa", "aaab")); // false
    }

    public static boolean isAnagram(String str, String str1) {

        if (str.length() != str1.length()) {
            return false;
        }
        char [] arrStr = str.toCharArray();
        char [] arrStr1 = str1.toCharArray();

        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        return Arrays.equals(arrStr,arrStr1);
    }
}
