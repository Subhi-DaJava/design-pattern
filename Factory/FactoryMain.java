package Factory;

/**
 * Created by pbebon on 12/12/2016.
 */
public class FactoryMain {
    public static void main(String[] args) {
        Usine usine = new Usine();
        Unite unite = usine.formerUnite(SimpleFabrique.TypeUnite.SOLDAT);
        System.out.println(unite);
        Unite unite2 = usine.formerUnite(SimpleFabrique.TypeUnite.COMMANDANT);
    }
}
