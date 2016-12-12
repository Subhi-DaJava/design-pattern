package Factory;

// Classe permettant de fabriquer une unité.
public class SimpleFabrique
{

    // Enumération des types d'unités.
    public enum TypeUnite
    {
        SOLDAT,
        COMMANDANT
    }

    // La création d'une unité en fonction de son type est encapsulée dans la fabrique.
    public Unite creerUnite(TypeUnite type)
    {
        Unite unite = null;;
        switch(type)
        {
            case SOLDAT:unite = new SoldatHumain();break;
            case COMMANDANT:unite = new CommandantHumain();break;
        }
        return unite;
    }
}

