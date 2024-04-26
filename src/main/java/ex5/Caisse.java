package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMin;
    private int poidsMax;

    public Caisse(String nom, int poidsMin, int poidsMax) {
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMin = poidsMin;
        this.poidsMax = poidsMax;
    }

    public boolean accepteItem(Item item) {
        int poids = item.getPoids();
        return poids >= poidsMin && (poidsMax == -1 || poids <= poidsMax);
    }

    public void addItem(Item item) {
        if (accepteItem(item)) {
            items.add(item);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
