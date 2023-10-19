package SortingInteger;

/**
 * Sorting : SortingInteger.MergeSort
 *
 * @author viaen
 * @version 19/10/2023
 */
public class MergeSort implements ISort{

    @Override
    public void sort(int[] array) {
        int inputLength = array.length;

        if (inputLength < 2) {
            return;
        }

        int leftSideLength = inputLength / 2;
        int rightSideLength = inputLength - leftSideLength;
        int[] leftHalf = new int[leftSideLength];
        int[] rightHalf = new int[rightSideLength];


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

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
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
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
