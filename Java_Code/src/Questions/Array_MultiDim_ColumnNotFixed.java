package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array_MultiDim_ColumnNotFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][]; //trying on my own...not relevant
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {9,10,11,12}

        };

//        //input // trying on my own...not relevant
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }

            //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();//(Arrays.toString(arr));
        }

    }
}
