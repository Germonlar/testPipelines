package org.example;

public class moveZeroes {

    public static void main(String[] args) {
        int myArr[] = {5,1,0,1,12,0,5};
        moveTheZeroes(myArr);


    }

    public static void moveTheZeroes( int[] myArr){
       int count = 0;
       for(int i = 0; i < myArr.length; i++){
           if(myArr[i] != 0){
               int temp = myArr[i];
               myArr[i] = myArr[count];
               myArr[count] = temp;
                count ++;
           }
       }

        for (int i : myArr){
            System.out.print(" " + i);
        }
    }




}
