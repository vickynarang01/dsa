package com.test.string;

public class ExtraCharacterString {

    public static char extra(char[] strA, char[] strB){


            // store string values in map
            int[] m1 = new int[256];

            // store second string in map with frequency
            for (int i = 0; i < strB.length; i++)
                m1[strB[i]]++;

            // store first string in map with frequency
            for (int i = 0; i < strA.length; i++)
                m1[strA[i]]--;

            for (int i=0;i<m1.length;i++)
            {

                // if the frequency is 1 then this
                // character is which is added extra
                if (m1[i]== 1)
                    return (char) i;
            }
            return Character.MIN_VALUE;
        }



    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "abecd";

        System.out.println(extra(s1.toCharArray(),s2.toCharArray()));

    }
}
