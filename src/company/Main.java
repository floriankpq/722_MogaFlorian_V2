package company;

import Controller.ProduktController;
import Controller.ProduktRepositoryInterface;
import Model.Produkt;

public class Main {

    public static void main(String[] args) {

        Produkt p1 = new Produkt("Produkt A", 23.5, "K67", 6);

        ProduktController produktRepo = new ProduktController();
        System.out.println("Done");
    }
}
