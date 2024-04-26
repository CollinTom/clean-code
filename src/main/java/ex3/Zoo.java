package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un zoo avec un ensemble d'animaux.
 */
public class Zoo {
    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour créer un nouveau zoo avec un nom spécifié.
     *
     * @param nom Le nom du zoo.
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param nomAnimal Le nom de l'animal à ajouter.
     * @param typeAnimal Le type de l'animal (e.g., Mammifère, Poisson).
     * @param comportement Le comportement alimentaire de l'animal (e.g., Herbivore, Carnivore).
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        animaux.add(new Animal(nomAnimal, typeAnimal, comportement));
    }

    /**
     * Affiche la liste de tous les animaux présents dans le zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne le nombre total d'animaux dans le zoo.
     *
     * @return le nombre d'animaux.
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return le nom du zoo.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo.
     *
     * @param nom Le nouveau nom du zoo.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
