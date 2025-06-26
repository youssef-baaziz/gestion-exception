package gestionExceptions;

class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, String nomTitulaire, double solde, double decouvertAutorise) {
        super(numeroCompte, nomTitulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde + decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants même avec le découvert autorisé.");
        }
        solde -= montant;
    }
}
