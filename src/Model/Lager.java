package Model;

import java.time.LocalDate;
import java.util.List;

/**
 * Lager besteht aus datum und liste von Produkte mit Anzahl
 */
public class Lager {

    private LocalDate datum;
    private List<Pair<Produkt, Integer>> produkteMenge;

    public Lager(LocalDate datum, List<Pair<Produkt, Integer>> produkteMenge) {
        this.datum = datum;
        this.produkteMenge = produkteMenge;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public List<Pair<Produkt, Integer>> getProdukteMenge() {
        return produkteMenge;
    }

    public void setProdukteMenge(List<Pair<Produkt, Integer>> produkteMenge) {
        this.produkteMenge = produkteMenge;
    }

    @Override
    public String toString() {
        return "Lager{" +
                "datum=" + datum +
                ", produkteMenge=" + produkteMenge +
                '}';
    }
}
