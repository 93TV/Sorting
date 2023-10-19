/**
 * Sorting : BubbleSort
 *
 * @author viaen
 * @version 19/10/2023
 */
public class BubbleSort implements ISort {


    @Override
    public void sort(int[] array) {
        int inputLength = array.length;
        int temp;
        boolean swappdSomething = true;
        while (swappdSomething) {
            swappdSomething = false;
            for (int i = 0; i < inputLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swappdSomething = true;
                }
            }
        }
    }

    @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
