package DesignPattern.Proxy;

/**
 * Created by pbebon on 12/12/2016.
 */
public class RealImage implements Image {
    private String nomFichier;

    public RealImage(String n) {
        this.nomFichier = n;
        loadingImageFromDisk();
    }

    public void display() {
        System.out.println("Affichage de :"+nomFichier);
    }

    public void loadingImageFromDisk() {
        System.out.println("Chargement de "+this.nomFichier+"........... 100 ms");
    }
}
