package company;

import Aufgabe1.Functions;
import Aufgabe1.Offerten;
import Aufgabe1.Repository;
import Controller.ProduktController;
import Controller.ProduktRepositoryInterface;
import Model.Produkt;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Produkt p1 = new Produkt("Produkt A", 23.5, "K67", 6);
//
//        ProduktController produktRepo = new ProduktController();
//        System.out.println("Done");

        Repository repository = new Repository();
        Functions functions = new Functions();

        try{
            List<Offerten> listeOfferten = repository.readFromFile("C:\\Workspace\\MAP\\Praktische Prufung Florian Moga\\src\\Aufgabe1\\offerten.txt", "&");
            listeOfferten.forEach(System.out::println);
            System.out.println("\n");
            functions.sortOffertenByPrice(listeOfferten).forEach(System.out::println);

            repository.writeToFile("C:\\Workspace\\MAP\\Praktische Prufung Florian Moga\\src\\Aufgabe1\\offertensortiert.txt", functions.sortOffertenByPrice(listeOfferten));
            //repository.writeToFile("C:\\Workspace\\MAP\\Praktische Prufung Florian Moga\\src\\Aufgabe1\\statistik.txt", repo.getMostFrequentPlace(listeOfferten));
            System.out.println(functions.getMostFrequentPlace(listeOfferten));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
