package com.company.searching_and_shorting;

/**
 * Created by Rajan Maurya on 06/04/17.
 * <p>
 * Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
 * A simple approach is to do linear search.The time complexity of above algorithm is O(n).
 * Another approach to perform the same task is using Binary Search.
 * <p>
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval
 * covering the whole array. If the value of the search key is less than the item in the middle of the interval,
 * narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is
 * found or the interval is empty.
 */
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int array[] = {2, 5, 7, 9, 23, 28, 31, 33, 36, 40, 45, 50, 53, 56};
        int number = 23;
        int result = ob.binarySearch(array, 0, (array.length - 1), number);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private int binarySearch(int array[], int firstIndex, int lastIndex, int number) {
        if (lastIndex >= firstIndex) {
            int mid = 1 + ((lastIndex - firstIndex) / 2);

            // If the element is present at the middle itself
            if (array[mid] == number) {
                return mid;
            }

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (array[mid] > number) {
                return binarySearch(array, firstIndex, (mid - 1), number);
            }

            // Else the element can only be present in right
            return binarySearch(array, (mid + 1), lastIndex, number);
        }
        return -1;
    }
}
