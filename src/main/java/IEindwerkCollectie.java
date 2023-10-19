/**
 *
 * @author Peter
 */
public interface IEindwerkCollectie {

    Eindwerk[] getEindwerkenVanOpleiding(String opleiding);

    void verwijder(Eindwerk eindwerk);

    void voegToe(Eindwerk eindwerk);
    
}
