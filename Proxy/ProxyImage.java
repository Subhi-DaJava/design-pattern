package DesignPattern.Proxy;

/**
 * Created by pbebon on 12/12/2016.
 */
public class ProxyImage implements Image{
    private String nomFichier;
    private RealImage realImage;

    public ProxyImage(String n) {
        this.nomFichier = n;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(nomFichier);
        }
        realImage.display();
    }

}
