package Decorator;

/**
 * Created by pbebon on 09/12/2016.
 */
public abstract class IngredientDecorator extends Dessert{
    protected Dessert dessert;
    public abstract String getNom();
    public abstract Float getPrice();

}
