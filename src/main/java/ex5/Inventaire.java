package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 4));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 21, -1));
    }

    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.addItem(item);
                break;
            }
        }
    }

    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
