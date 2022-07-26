package com.test;

import java.util.Arrays;

public class LargestNumberArray {

    // Method to find maximum in arr[]
    static int largest(int[] arr)
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,30,4,50};
        // Easy solution is to use Arrays.sort method and print last element as that will be the biggest element
       // Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println("Largest in given array is " + largest(arr));
    }
}
