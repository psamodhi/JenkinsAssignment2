package com.Exceptions;

public class ExceptionHandling {
    public static void main (String [] args){

        try{
            int myInt =Integer.parseInt("rat");
            System.out.println("If exception not thrown, then this will be printed");
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Please put a valid int value");
        }

        finally {                      // code that will execute always, whether there was an exception or not
            System.out.println("Hi");
        }
        System.out.println("Hello Priya");
    }
}
