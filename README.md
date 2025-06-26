# 🧾 TP 5 : Gestion des Exceptions en Java

## 🎯 Objectifs pédagogiques

- Apprendre à créer et gérer des **exceptions personnalisées** en Java.
- Comprendre et appliquer les principes de la **programmation orientée objet (POO)**.
- Concevoir un système robuste avec **gestion d’erreurs**.
- Utiliser des collections (`ArrayList`) pour gérer un ensemble d’objets.

---

## 🧪 Exercice 1 : Classe `EntierNaturel` et Exception `NombreNegatifException`

### 🔧 Spécifications

- Créer une classe `EntierNaturel` :

  - Attribut privé `val` de type `int`.
  - Constructeur qui initialise `val`, lève une `NombreNegatifException` si la valeur est négative.
  - Méthodes :
    - `getVal()` : retourne `val`
    - `setVal(int val)` : modifie `val`, lève `NombreNegatifException` si valeur négative.
    - `decrementer()` : décrémente `val`, lève exception si résultat < 0.

- Créer une classe d’exception personnalisée `NombreNegatifException` :
  - Hérite de `Exception`
  - Contient un champ `valeurErronee`
  - Méthode `getValeurErronee()` pour accéder à la valeur fautive

### 🧬 Exemple de code```java

public class NombreNegatifException extends Exception {
private int valeurErronee;

    public NombreNegatifException(String message, int valeur) {
        super(message);
        this.valeurErronee = valeur;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }

}

🏦 Exercice 2 : Gestion de comptes bancaires
🔧 Spécifications
✅ Classe de base : CompteBancaire
Attributs :

- numeroCompte
- solde
- titulaire

Méthodes :

- deposer(double montant)
- retirer(double montant)
- afficherSolde()
- transfererVers(CompteBancaire destinataire, double montant)

📛 Exceptions personnalisées

- FondsInsuffisantsException : levée si le solde est insuffisant
- CompteInexistantException : levée si le compte destinataire est introuvable

🔁 Sous-classes

- CompteCourant : Autorise un découvert (attribut decouvertAutorise)
- CompteEpargne : Méthode calculerInterets() pour générer des intérêts

📸 Captures d'écran (à insérer)
🔽 Insérez ici vos captures d'écran :

- Exemple de NombreNegatifException déclenchée
- Dépôt / Retrait sur un compte
- Transfert réussi et transfert échoué
- Affichage du solde après génération d'intérêts

👨‍🏫 Encadrant
Réalisé dans le cadre du module Programmation Orientée Objet - Java (2024)
Encadré par : Mr. Abdelmajid BOUSSELHAM
