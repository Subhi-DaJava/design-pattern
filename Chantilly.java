package Decorator;

/**
 * Created by pbebon on 09/12/2016.
 */
public class Chantilly extends IngredientDecorator {
    public Chantilly(Dessert d) {
        this.dessert = d;
    }

    @Override
    public String getNom() {
        return dessert.getNom()+", Chantilly";
    }

    @Override
    public Float getPrice() {
        return dessert.getPrice()+0.5F;
    }
}
