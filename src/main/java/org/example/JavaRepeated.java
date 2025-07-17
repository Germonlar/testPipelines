package org.example;


import java.util.HashMap;
import java.util.Map;

public class JavaRepeated {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String word = "aaplle";

     for(int i = 0; i < word.length(); i++){
            String key = (""+word.charAt(i));
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key, 1);
            }
            
     }  

   for(Map.Entry<String,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey()  +" Valor " + entry.getValue() );
   }




    }

}
