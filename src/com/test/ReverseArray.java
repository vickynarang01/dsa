package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    /* Function to reverse arr[] from
   start to end*/
    static void rvereseArray(int arr[],
                             int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /* Utility that prints out an
    array on a line */
    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6,7};
      //  printArray(arr, 7);
        rvereseArray(arr, 0, 6);
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }
      //  System.out.print("Reversed array is \n");
      //  printArray(arr, 7);
    }
}
