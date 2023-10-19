import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sorting : MainSortTest
 *
 * @author viaen
 * @version 19/10/2023
 */
public class MainSortTest {




    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        InsesrtionSort is = new InsesrtionSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
//
//        System.out.println("BubbleSort N : 10");
//        int[] initArray = Helper.fillArray(10);
//        double start= System.currentTimeMillis();
//        bs.sort(initArray);
//        double end = System.currentTimeMillis();
//        System.out.println(end - start);

        double start= System.currentTimeMillis();
        Arrays.sort(Helper.fillArray(1000000));
        double end = System.currentTimeMillis();
        System.out.println(end - start);

//        System.out.println("BubbleSort N : 100");
//        start= System.currentTimeMillis();
//        bs.sort(Helper.fillArray(100));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("BubbleSort N : 1000");
//        start= System.currentTimeMillis();
//        bs.sort(Helper.fillArray(1000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
////
////        System.out.println("BubbleSort N : 10000");
////        start= System.currentTimeMillis();
////        bs.sort(Helper.fillArray(10000));
////        end = System.currentTimeMillis();
////        System.out.println(end - start);
////
////        System.out.println("BubbleSort N : 100000");
////        start= System.currentTimeMillis();
////        bs.sort(Helper.fillArray(100000));
////        end = System.currentTimeMillis();
////        System.out.println(end - start);
////
////        System.out.println("BubbleSort N : 1000000");
////        start= System.currentTimeMillis();
////        bs.sort(Helper.fillArray(1000000));
////        end = System.currentTimeMillis();
////        System.out.println(end - start);
//
//        System.out.println("InsertionSort N : 10");
//        start= System.currentTimeMillis();
//        is.sort(Helper.fillArray(10));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("InsertionSort N : 100");
//        start= System.currentTimeMillis();
//        is.sort(Helper.fillArray(100));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("InsertionSort N : 1000");
//        start= System.currentTimeMillis();
//        is.sort(Helper.fillArray(1000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("InsertionSort N : 10000");
//        start= System.currentTimeMillis();
//        is.sort(Helper.fillArray(10000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("InsertionSort N : 100000");
//        start= System.currentTimeMillis();
//        is.sort(Helper.fillArray(100000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
////
////        System.out.println("InsertionSort N : 1000000");
////        start= System.currentTimeMillis();
////        is.sort(Helper.fillArray(1000000));
////        end = System.currentTimeMillis();
////        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 10");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(10));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 100");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(100));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 1000");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(1000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 10000");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(10000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 100000");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(100000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("MergeSort N : 1000000");
//        start= System.currentTimeMillis();
//        ms.sort(Helper.fillArray(1000000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 10");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(10));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 100");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(100));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 1000");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(1000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 10000");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(10000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 100000");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(100000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//        System.out.println("QuickSort N : 1000000");
//        start= System.currentTimeMillis();
//        qs.sort(Helper.fillArray(1000000));
//        end = System.currentTimeMillis();
//        System.out.println(end - start);

    }

}
