package Controller;

import Model.Pair;
import Model.Produkt;

import java.time.LocalDate;
import java.util.List;

public class LagerController implements LagerControllerInterface{

    private List<Pair<Produkt,Integer>> lager;

    @Override
    public void writeUpdate(LocalDate datum, Pair<Produkt, Integer> produktMenge) {
        Produkt pToUpdate = produktMenge.getLeft();
        int menge = produktMenge.getRight();


    }
}
