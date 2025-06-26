package gestionExceptions;


class CompteBancaire {
    protected String numeroCompte;
    protected double solde;
    protected String nomTitulaire;

    public CompteBancaire(String numeroCompte, String nomTitulaire, double solde) {
        this.numeroCompte = numeroCompte;
        this.nomTitulaire = nomTitulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer ce retrait.");
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + " : " + solde + "€");
    }

    public void transfererVers(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        this.retirer(montant);
        destinataire.deposer(montant);
    }
}
