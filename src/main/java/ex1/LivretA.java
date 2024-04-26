package ex1;

/**
 * Classe représentant un Livret A, dérivée de CompteBancaire.
 */
public class LivretA extends CompteBancaire {
    private double tauxRemuneration;

    public LivretA(double soldeInitial, double tauxRemuneration) {
        super(soldeInitial, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Débite un montant du Livret A sans permettre un découvert.
     * @param montant Le montant à débiter.
     */
    @Override
    public void debiterMontant(double montant) {
        if (getSolde() >= montant) {
            super.ajouterMontant(-montant);
        } else {
            System.out.println("Opération non autorisée : fonds insuffisants.");
        }
    }

    /**
     * Applique la rémunération annuelle au solde du Livret A.
     */
    public void appliquerRemunerationAnnuelle() {
        double remuneration = getSolde() * tauxRemuneration;
        super.ajouterMontant(remuneration);
    }
}