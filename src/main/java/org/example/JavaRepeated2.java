package org.example;

import java.util.HashMap;

public class JavaRepeated2 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String str = "applle";

        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            if (map.keySet().contains(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }

        }

        for (String i : map.keySet()) {
            System.out.print(i + " : " + map.get(i));


        }
    }
}

