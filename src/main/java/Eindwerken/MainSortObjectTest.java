package Eindwerken;

import Eindwerken.BubbleSortEindwerken;
import Eindwerken.EindwerkenArray;
import Eindwerken.InsesrtionSortEindwerken;

import java.io.IOException;
import java.util.Arrays;

/**
 * Sorting : Eindwerken.MainSortObjectTest
 *
 * @author kiana
 * @version 19/10/2023
 */
public class MainSortObjectTest {
    public static void main(String[] args) {
        EindwerkenArray arrEindwerken = new EindwerkenArray();
        BubbleSortEindwerken bubbleSort = new BubbleSortEindwerken();
        InsesrtionSortEindwerken insertEind = new InsesrtionSortEindwerken();
        MergeSortEindwerken mergEind = new MergeSortEindwerken();
        QuickSortEindwerken quickEind = new QuickSortEindwerken();

        try {
            arrEindwerken.leesBestand();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double start = System.currentTimeMillis();

        System.out.println("before");
//        bubbleSort.printArray(arrEindwerken.getEindwerken());
//        bubbleSort.sort(arrEindwerken.getEindwerken());
//            insertEind.sort(arrEindwerken.getEindwerken());
//        mergEind.sort(arrEindwerken.getEindwerken());
//        quickEind.sort(arrEindwerken.getEindwerken());
        Arrays.sort(arrEindwerken.getEindwerken());
        System.out.println("After");
//        bubbleSort.printArray(arrEindwerken.getEindwerken());

        double end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
