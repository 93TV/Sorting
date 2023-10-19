import java.io.IOException;

/**
 * Sorting : MainSortObjectTest
 *
 * @author kiana
 * @version 19/10/2023
 */
public class MainSortObjectTest {
    public static void main(String[] args) {
        EindwerkenArray arrEindwerken = new EindwerkenArray();
        BubbleSortEindwerken bubbleSort = new BubbleSortEindwerken();


        try {
            arrEindwerken.leesBestand();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double start = System.currentTimeMillis();
        System.out.println("before");
        bubbleSort.sort(arrEindwerken.getEindwerken());
        System.out.println("After");
        //bubbleSort.printArray(arrEindwerken.getEindwerken());
        double end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}