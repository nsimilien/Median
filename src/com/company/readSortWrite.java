package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class readSortWrite {
    public static void main(String[] args) throws IOException {
        int num = 5;
        //create an array
        int[] values = new int[num];
        System.out.println(Arrays.toString(values));

        int i = 0;

        File myFile = new File("numberIn");
        Scanner inputFile = new Scanner(myFile);
        int number = inputFile.nextInt();
        //add numbers to an array
        while (inputFile.hasNextInt()) {
            values[i++] = number;
            //System.out.println(number);
            number = inputFile.nextInt();
        }
        //System.out.println(number);
        values[i++] = number;

        System.out.println("The unsorted array values are:");
        for (int value : values)
            System.out.println(value);

        //Sort the Array
        ArrayTool.selectionSort(values);

        //Display the sorted values
        System.out.println("The sorted values are:");
        for (int index = 0; index < values.length; index++)
            System.out.println(values[index]);

        int median = values.length / 2 +1;
        int median2 = values.length / 2;

        if (values.length / 2 == 0) {
            System.out.println("The median is:");
            System.out.println(median2);
        } else {
            //(values.length / 2 != 0)
            System.out.println("The median is:");
            System.out.println((values[median2] + values[median]) / 2);
        }

        FileWriter fw = new FileWriter("numberOut.txt", false);
        PrintWriter outputFile = new PrintWriter(fw);
        outputFile.println("The median is:");
        outputFile.println((values[median2] + values[median]) / 2);
        outputFile.close();
    }
}

