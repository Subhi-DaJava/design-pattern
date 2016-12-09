package Decorator;

/**
 * Created by pbebon on 09/12/2016.
 */
public class MainDecorator {
    public static void main(String[] args) {
        Dessert crepe = new Crepe();
        System.out.println(crepe);
        crepe = new Chantilly(crepe);
        crepe = new Chocolat(crepe);
        System.out.println(crepe);
    }
}
