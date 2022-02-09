package practice_02_09_2022.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        // System.out.println()  --> Syntax Error

        Thread.sleep(3000);
        //FileInputStream fileInputStream=new FileInputStream("");


        System.out.println("Before Read File");
        readFromFile("path");
        System.out.println("After Read File");



    }

    public  static void readFromFile(String path) throws FileNotFoundException {
        // Option 1
        try {
            FileInputStream fileInputStream=new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is handled");        }
        // Option 2
        FileInputStream fileInputStream=new FileInputStream("");

    }
}
