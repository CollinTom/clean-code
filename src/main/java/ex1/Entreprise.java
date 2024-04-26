package ex1;

import java.util.Date;

/**
 * Classe représentant les informations d'une entreprise.
 */
public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    private int siret;
    private String nom;
    private String adresse;
    private Date dateCreation;

    // Constructeur pour initialiser les attributs de l'entreprise
    public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    /**
     * Retourne une chaîne de caractères représentant l'objet Entreprise.
     * @return une représentation textuelle de l'entreprise.
     */
    @Override
    public String toString() {
        return "Entreprise{" +
                "SIRET=" + siret +
                ", Nom='" + nom + '\'' +
                ", Adresse='" + adresse + '\'' +
                ", Date de Création=" + dateCreation +
                ", Capital Maximum Autorisé=" + CAPITAL_MAX +
                '}';
    }

    /**
     * Affiche le statut actuel de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println(this.toString());
    }

    // Getters et Setters pour les attributs privés
    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
