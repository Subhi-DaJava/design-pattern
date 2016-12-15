package DesignPattern.Proxy;

/**
 * Created by pbebon on 12/12/2016.
 */
public class ProxyTester {
    public static void main(String[] args) {


        System.out.println("REEL");
        Image monImage = new RealImage("FUNNY_CAT.GIF");
        monImage.display();
        monImage.display();

        System.out.println("PROXY");
        Image monImageProxy = new ProxyImage("FUNNY_CAT.GIF");
        monImageProxy.display();
        monImageProxy.display();
    }
}
