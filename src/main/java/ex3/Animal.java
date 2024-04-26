package ex3;

/**
 * Représente un animal dans un zoo, avec des informations sur son nom, type et comportement.
 */
public class Animal {
    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur pour créer un nouvel animal.
     *
     * @param nom Le nom de l'animal.
     * @param type Le type de l'animal (e.g., Mammifère, Poisson, Reptile).
     * @param comportement Le comportement alimentaire de l'animal (e.g., Herbivore, Carnivore).
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Fournit une représentation textuelle de cet animal.
     *
     * @return une chaîne de caractères décrivant l'animal.
     */
    @Override
    public String toString() {
        return nom + " (" + type + ", " + comportement + ")";
    }
}
