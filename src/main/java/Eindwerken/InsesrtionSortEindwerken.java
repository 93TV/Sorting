package Eindwerken;

/**
 * Sorting : SortingInteger.InsesrtionSort
 *
 * @author viaen
 * @version 19/10/2023
 */
public class InsesrtionSortEindwerken implements ISortObject {
    @Override
    public void sort(Comparable[] array) {
        int inputLength = array.length;

        for (int i = 1; i < inputLength; i++) {
            Comparable currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(currentValue)<0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }

    @Override
    public void printArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
