package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class read {
    public static void main(String[] args) throws IOException {
        File myFile = new File("numberIn");
        Scanner inputFile = new Scanner(myFile);
        int numbers = inputFile.nextInt();

        int num = 5;
        int[] values = new int[num];

        while (inputFile.hasNextInt())
            System.out.println(inputFile.nextInt());
            System.out.println(numbers);

        //values[index] = inputFile.nextInt();
        Arrays.fill(values, numbers);
        System.out.println(Arrays.toString(values));


        System.out.println("The unsorted array values are:");
        for (int value : values)
            System.out.println(value);

        //Sort the Array
        ArrayTool.selectionSort(values);

        //Display the sorted values
        System.out.println("The sorted values are:");
        for (int value : values) {
            System.out.println(value);
        }
    }
}

