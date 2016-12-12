package Factory;

import java.util.ArrayList;

/**
 * Created by pbebon on 12/12/2016.
 */
// Classe représentant un commandant humain.
public class CommandantHumain extends Unite
{
    // Constructeur pour un commandant humain.
    public CommandantHumain()
    {
        this.nom = "Lieutenant";
        this.coutConstruction = 14;
        this.precisionAttaque = 5;
        this.esquiveDefense = 2;
        this.equipements = new ArrayList();
    }

    // Equiper un commandant humain.
    public void equiper()
    {
        this.equipements.add("Uzi");
        this.equipements.add("Bouclier");
        System.out.println("Equipement d'un commandant humain (Uzi, Bouclier).");
    }
}