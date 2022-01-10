package Controller;

import Model.Lager;
import Model.Pair;
import Model.Produkt;

import java.time.LocalDate;
import java.util.List;

public interface LagerControllerInterface {

    Lager addLager(LocalDate datum, List<Pair<Produkt, Integer>> produkteMenge);

    Lager 
}
