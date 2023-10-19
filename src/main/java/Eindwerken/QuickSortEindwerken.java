package Eindwerken;

import Eindwerken.ISortObject;

import java.util.Random;

/**
 * Sorting : Eindwerken.QuickSortEindwerken
 *
 * @author frede
 * @version 10/19/2023
 */
public class QuickSortEindwerken implements ISortObject {

    @Override
    public void sort(Comparable[] array) {
        sort(array, 0, array.length-1);
    }

    public void sort(Comparable[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Comparable pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = lowIndex, rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer].compareTo(pivot) < 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer].compareTo(pivot) > 0 && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        sort(array,lowIndex, leftPointer - 1);
        sort(array,leftPointer + 1, highIndex);
    }
    private void swap(Comparable[] array, int index1, int index2) {
        Comparable temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    @Override
    public void printArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
