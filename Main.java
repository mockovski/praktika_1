package com.company;
//Практика 1
public class Main {

    public static void main(String[] args) {
        // write your code here
        int summa = 0;
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for( int i=0; i<Array.length;  i++)
            summa += Array[i];
        System.out.println(summa);


    }
}