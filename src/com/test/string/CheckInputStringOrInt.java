package com.test.string;

public class CheckInputStringOrInt {

    // Driver code
    static public void main(String[] args)
    {
        String s = "abc"; //sample input to test
        try{
            Integer.parseInt(s);
            System.out.println("Integer");
        }catch(NumberFormatException e){
            System.out.println("String");
        }
    }
}
