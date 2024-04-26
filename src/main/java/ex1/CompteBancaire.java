package ex1;

/**
 * Classe de base pour les comptes bancaires.
 */
public class CompteBancaire {
    private double solde;
    private double decouvertAutorise;

    public CompteBancaire(double soldeInitial, double decouvertAutorise) {
        this.solde = soldeInitial;
        this.decouvertAutorise = decouvertAutorise;
    }

    /**
     * Ajoute un montant au solde du compte.
     * @param montant Le montant à ajouter.
     */
    public void ajouterMontant(double montant) {
        solde += montant;
    }

    /**
     * Débite un montant du compte, dans la limite du découvert autorisé.
     * @param montant Le montant à débiter.
     */
    public void debiterMontant(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Opération non autorisée : dépassement de découvert.");
        }
    }

    // Getters pour accéder aux propriétés privées
    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }
}

