package ex2;

/**
 * Classe représentant un Livret A, spécialisation de CompteBancaire.
 */
public class LivretA extends CompteBancaire {
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (getSolde() >= montant) {
            super.ajouterMontant(-montant);
        } else {
            System.out.println("Fonds insuffisants, impossible de retirer.");
        }
    }

    public void appliquerRemuAnnuelle() {
        double remuneration = getSolde() * tauxRemuneration;
        super.ajouterMontant(remuneration);
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }
}
