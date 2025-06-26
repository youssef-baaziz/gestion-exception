package gestionExceptions;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        CompteCourant compte1 = new CompteCourant("12345", "Alice", 1000, 500);
        CompteEpargne compte2 = new CompteEpargne("67890", "Bob", 2000, 2.5);

        comptes.add(compte1);
        comptes.add(compte2);

        try {
            compte1.retirer(1200);
            compte1.afficherSolde();
            compte1.transfererVers(compte2, 500);
            compte2.afficherSolde();
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
