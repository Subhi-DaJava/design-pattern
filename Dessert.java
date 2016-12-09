package Decorator;

import java.text.NumberFormat;

/**
 * Created by pbebon on 09/12/2016.
 */
public abstract class Dessert {
    public String nom;
    public Float price;


    public String toString() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(2);
        return this.getNom()+" : "+numberFormat.format(this.getPrice())+"€ ";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
