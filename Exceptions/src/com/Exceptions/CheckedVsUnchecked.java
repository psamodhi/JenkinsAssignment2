package com.Exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

    public static void main (String [] args) throws FileNotFoundException {

        readFile("myFile.txt");
       String  name =null;
       printhLength(name);
    }


    private static void readFile(String fileName) throws FileNotFoundException{

        try {
            FileReader reader = new FileReader(fileName);
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Hey that file doesn't exist!");
        }
    }

    private static void printhLength(String MyString) throws NullPointerException{
        System.out.println(MyString.length());
    }





}
