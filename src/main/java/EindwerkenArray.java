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
public class EindwerkenArray {
    private Eindwerk[] eindwerken;
    public Eindwerk[] getEindwerken() {
        return eindwerken;
    }

    public void setEindwerken(Eindwerk[] eindwerken) {
        this.eindwerken = eindwerken;
    }

    public void leesBestand() throws IOException {
        eindwerken = new Eindwerk[10000];
        File file = new File("src/main/java/eindwerken.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int i = 0;
        while (br.readLine() != null && i < eindwerken.length) {
            String line = br.readLine();
            String[] sliced = line.split("\\$");
            Student student = new Student(sliced[0], sliced[1], Integer.parseInt(sliced[2]));
            Eindwerk eindwerk = new Eindwerk(sliced[3], Integer.parseInt(sliced[4]), sliced[5], student);
            eindwerken[i] = eindwerk;
            i++;
        }
    }


}
