package SortingInteger;

/**
 * Sorting : SortingInteger.InsesrtionSort
 *
 * @author viaen
 * @version 19/10/2023
 */
public class InsesrtionSort implements ISort{
    @Override
    public void sort(int[] array) {
        int inputLength = array.length;

        for (int i = 1; i < inputLength; i++) {
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }

    @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
