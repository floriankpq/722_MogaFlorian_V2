package Model;

public class Produkt {

    private String name;
    private Double preis;
    private String SKU;
    private int anzahl;

    public Produkt(String name, Double preis, String SKU, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.SKU = SKU;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", SKU='" + SKU + '\'' +
                ", anzahl=" + anzahl +
                '}';
    }
}
