package ex2;

/**
 * Classe de base pour les comptes bancaires.
 */
public class CompteBancaire {
    private double solde;
    private double decouvert;

    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void ajouterMontant(double montant) {
        solde += montant;
    }

    public void debiterMontant(double montant) {
        if (solde - montant >= -decouvert) {
            solde -= montant;
        } else {
            System.out.println("Dépassement de découvert non autorisé.");
        }
    }

    // Getters and Setters
    public double getSolde() {
        return solde;
    }

    public double getDecouvert() {
        return decouvert;
    }
}
