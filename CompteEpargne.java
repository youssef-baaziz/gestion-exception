package gestionExceptions;

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, String nomTitulaire, double solde, double tauxInteret) {
        super(numeroCompte, nomTitulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        solde += solde * tauxInteret / 100;
    }
}
