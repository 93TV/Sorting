package SortingInteger;

import java.util.Random;

/**
 * Sorting : SortingInteger.QuickSort
 *
 * @author viaen
 * @version 19/10/2023
 */
public class QuickSort implements ISort{
    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length-1);
    }

    public void sort(int[] inputArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = inputArray[pivotIndex];
        swap(inputArray, pivotIndex, highIndex);

        int leftPointer = lowIndex, rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (inputArray[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (inputArray[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(inputArray, leftPointer, rightPointer);
        }
        swap(inputArray, leftPointer, highIndex);
        sort(inputArray,lowIndex, leftPointer - 1);
        sort(inputArray,leftPointer + 1, highIndex);
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
