package Decorator;

/**
 * Created by pbebon on 09/12/2016.
 */
public class Chocolat extends IngredientDecorator {
    public Chocolat(Dessert d) {
        this.dessert = d;
    }

    @Override
    public String getNom() {
        return dessert.getNom()+", Chocolat";
    }

    @Override
    public Float getPrice() {
        return dessert.getPrice()+0.75F;
    }
}
