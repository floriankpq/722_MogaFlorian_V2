package Controller;

import Model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProduktController implements ProduktRepositoryInterface{

    private final List<Produkt> produkte;

    public ProduktController() {
        this.produkte = new ArrayList<>();
    }

    @Override
    public Produkt addProdukt(String name, Double preis, String SKU, int anzahl) {
        Produkt prod = new Produkt(name,preis,SKU,anzahl);
        produkte.add(prod);
        return prod;
    }

    @Override
    public void deleteProdukt(String name) {
        produkte.removeIf(p -> Objects.equals(p.getName(), name));
    }

    @Override
    public void updateProdukt(String name, Double preis, String SKU, int anzahl) {
        for(Produkt p : produkte){
            if(Objects.equals(p.getName(), name)){
                p.setPreis(preis);
                p.setAnzahl(anzahl);
                p.setSKU(SKU);
            }
        }
    }

    @Override
    public List<Produkt> getAll() {
        return produkte;
    }

    @Override
    public Produkt findOne(String name) {
        for(Produkt p : produkte){
            if(Objects.equals(p.getName(), name)){
                return p;
            }
        }
        return null;
    }
}
