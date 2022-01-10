package Controller;

import Model.Produkt;

import java.util.List;

public interface ProduktRepositoryInterface {

    /**
     * Adds a product
     * @param name String
     * @param preis Double
     * @param SKU String
     * @param anzahl Int
     * @return Produkt
     */
    Produkt addProdukt(String name, Double preis, String SKU, int anzahl);

    /**
     * Deletes a Produkt based on it's unique name
     * @param name String
     */
    void deleteProdukt(String name);

    /**
     * Updates a Produkt
     * @param name String
     * @param preis Double
     * @param SKU String
     * @param anzahl Int
     */
    void updateProdukt(String name, Double preis, String SKU, int anzahl);

    /**
     * Gets all Produkts
     * @return  List<Produkt>
     */
    List<Produkt> getAll();

    /**
     * Finds a Produkt based on it's name
     * @param name String
     * @return Produkt
     */
    Produkt findOne(String name);
}
