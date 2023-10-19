/**
 * Sorting : BubbleSortEindwerken
 *
 * @author kiana
 * @version 19/10/2023
 */
public class BubbleSortEindwerken implements ISortObject {
    @Override
    public void sort(Comparable[] array) {
        int inputLength = array.length;
        Comparable temp;
        boolean swappdSomething = true;
        while (swappdSomething) {
            swappdSomething = false;
            for (int i = 0; i < inputLength - 1; i++) {
                if (array[i].compareTo(array[i + 1]) == -1) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swappdSomething = true;
                }
            }
        }
    }

    @Override
    public void printArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());

        }
    }

}
