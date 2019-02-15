
/**
 * Beheer systeem voor je beerput.
 *
 * @author (Tom Verpooten )
 * @version (0.00.001a)
 */
public class Beerput
{
    private int intInhoud;
    private int intHoeVol;

    /**
     * Constructor for objects of class Beerput
     */
    public Beerput(int Inhoud)
    {
        intInhoud = Inhoud;
    }

    /**
     * Geeft de aantal liters op waar mee de beerput is gevult.
     */
    public void setVullen(int _HoeVol)
    {
        intHoeVol = intHoeVol + _HoeVol;
        
        if (intInhoud > intHoeVol)
        {
            System.out.println("De beerput is nog niet vol.");
            System.out.println("");
            System.out.println("Maximum capaciteit: 150 000");
            System.out.println("De beerput is voor " + intHoeVol);
            System.out.println("");
        }
        
        else
        {
            System.out.println("De beerput is vol, hij loopt over.");
            System.out.println("");
            System.out.println("Maximum capaciteit: " + intInhoud + " liter.");
            System.out.println("De beerput is voor " + intHoeVol + " liter.");
            System.out.println("");
        }
    }
    
    public void leegmaken()
    {
        intHoeVol = 0;
    }
    
    public int getInhoud()
    {
        return intHoeVol;
    }
}
