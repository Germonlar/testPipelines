package org.example;

import java.util.*;

public class JavaRepeated {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String word = "aaplle";

        for(int i=0;i<word.length();i++){
            String key = ""+ word.charAt(i);
            if(map.keySet().contains(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }

        for(String i : map.keySet()){
            System.out.println("KEY : " + i + " Value : "+ map.get(i));
        }




    }

}
