package org.example;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] palabras = {"flower", "flow", "flight", "lo"};

        String solucion = longestCommonPrefix(palabras);
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Mientras el prefijo no esté al inicio del string actual, lo acortamos
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
