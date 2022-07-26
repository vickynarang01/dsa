package com.test;

import java.util.Arrays;

public class ArrayRotation {

    public static int[] rotateArray(int rotateBy, int[] arrayint){
        int[] temp1 = new int[rotateBy];
        int[] temp2 = new int[arrayint.length-rotateBy];
        for (int i=0; i<arrayint.length;i++)
        {
            if(i<rotateBy){
                temp1[i]=arrayint[i];
                System.out.println("temp1"+temp1[i]);
            }
            else{
                temp2[i-rotateBy] = arrayint[i];
                System.out.println("temp1"+temp2[i-rotateBy]);
            }
        }
        int[] temp3 = Arrays.copyOf(temp2,arrayint.length);
        System.arraycopy(temp1,0,temp3,temp2.length,temp1.length);
        return temp3;
    }

    public static void main(String[] args) {

        int[] arrayint = {1,2,3,4,5};
        int rotateBy = 2;

        System.out.println(Arrays.toString(rotateArray(rotateBy,arrayint)));
        }

}
