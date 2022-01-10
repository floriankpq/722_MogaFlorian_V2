package Controller;

import Model.Lager;
import Model.Pair;
import Model.Produkt;

import java.time.LocalDate;
import java.util.List;

public interface LagerControllerInterface {

    void writeUpdate(LocalDate datum, Pair<Produkt, Integer> produkteMenge);
}
