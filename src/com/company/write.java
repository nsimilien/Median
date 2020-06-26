package com.company;
import java.util.Scanner;
import java.io.*;

public class write {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("numberOut.txt", false);
        PrintWriter outputFile = new PrintWriter(fw);
        outputFile.println("The median is:");
        outputFile.println("median");
        outputFile.close();


    }

}


