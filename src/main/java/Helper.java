/**
 * Sorting : Helper
 *
 * @author viaen
 * @version 19/10/2023
 */
public class Helper {

    private static int[] fillArray(int initLength) {
        int[] initArray = new int[initLength];
        for (int i = 0; i < initLength; i++) {
            initArray[i] = (int) (1 + Math.random() * 10000);
        }
        return initArray;
    }
}
