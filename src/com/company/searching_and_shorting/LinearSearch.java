package com.company.searching_and_shorting;

import java.util.Scanner;

/**
 * Created by Rajan Maurya on 02/04/17.
 Linear Search
 Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
 A simple approach is to do linear search, i.e
 Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 If x matches with an element, return the index.
 If x doesn’t match with any of elements, return -1.
 */
public class LinearSearch {

    public static void main(String[] args) {

        int[] numberArray = {2,4, 5, 6, 9, 3, 78, 45, 8, 0};

        System.out.println("Please enter number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        linearSearch(numberArray, number);
    }

    /**
     * We are for loop instead of foreach loop because we want to check the index simultaneously.
     * @param arr Array of number
     * @param number Number that need to search from array
     * @return true if found number otherwise false.
     */
    private static int linearSearch(int arr[], int number) {
        for (int i = 0; i<arr.length; ++i) {
            if(arr[i] == number) {
                System.out.print(number + " Number found at position " + i);
                return i;
            }
        }
        System.out.print("Number does not exist in array");
        return -1;
    }
}
