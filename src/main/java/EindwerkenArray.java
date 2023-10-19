import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Sorting : EindwerkenArray
 *
 * @author kiana
 * @version 19/10/2023
 */
public class EindwerkenArray implements ISortObject {
    private Eindwerk[] eindwerken;
    public Eindwerk[] getEindwerken() {
        return eindwerken;
    }

    public void setEindwerken(Eindwerk[] eindwerken) {
        this.eindwerken = eindwerken;
    }

    public void leesBestand() throws IOException {
        eindwerken = new Eindwerk[10];
        File file = new File("src/main/java/eindwerken.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int i = 0;
        while (br.readLine() != null && i < 10) {
            String line = br.readLine();
            String[] sliced = line.split("\\$");
            Student student = new Student(sliced[0], sliced[1], Integer.parseInt(sliced[2]));
            Eindwerk eindwerk = new Eindwerk(sliced[3], Integer.parseInt(sliced[4]), sliced[5], student);
            eindwerken[i] = eindwerk;
            i++;
        }
    }

    @Override
    public void sort(Eindwerk[] eindwerken) {

    }

    @Override
    public void printArray(Eindwerk[] array) {
        for (int i = 0; i < eindwerken.length; i++) {
            System.out.println(eindwerken[i].toString());

        }

    }

    public static void main(String[] args) throws IOException {
        EindwerkenArray arrEindwerken = new EindwerkenArray();
        try {
            arrEindwerken.leesBestand();
        } catch (Exception e) {
            System.out.println(e);
        }
        arrEindwerken.printArray(arrEindwerken.getEindwerken());




    }

}
