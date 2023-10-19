package Eindwerken;

import Eindwerken.ISortObject;

/**
 * Sorting : Eindwerken.MergeSortEindwerken
 *
 * @author frede
 * @version 10/19/2023
 */
public class MergeSortEindwerken implements ISortObject {



    @Override
    public void sort(Comparable[] array) {
        int inputLength = array.length;

        if (inputLength < 2) {
            return;
        }

        int leftSideLength = inputLength / 2;
        int rightSideLength = inputLength - leftSideLength;
        Comparable[] leftHalf = new Comparable[leftSideLength];
        Comparable[] rightHalf = new Comparable[rightSideLength];


        for (int i = 0; i < leftSideLength; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = leftSideLength; i < inputLength; i++) {
            rightHalf[i - leftSideLength] = array[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(Comparable[] inputArray, Comparable[] leftHalf, Comparable[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) > 0) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    @Override
    public void printArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
