package com.company;

public class Sort {

    public static void main(String[] args) {
        // create an array
        int[] values = {5, 7, 2, 8, 9, 1};
        //Display unsorted array
        System.out.println("The unsorted array values are:");
        for (int value : values)
            System.out.println(value);

        //Sort the Array
        ArrayTool.selectionSort(values);

        //Display the sorted values
        System.out.println("The sorted values are:");
        for (int index = 0; index < values.length; index++)
            System.out.println(values[index]);

        int median = values.length / 2 - 1;
        int median2 = values.length / 2;

        if (values.length / 2 == 0) {
            System.out.println("The median is:");
            System.out.println(median2);
        }
        else{
            //(values.length / 2 != 0)
            System.out.println("The median is:");
            System.out.println((values[median2] + values[median]) / 2);
        }
    }
}