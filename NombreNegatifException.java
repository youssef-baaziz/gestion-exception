package gestionExceptions;

class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(int valeur) {
        super("Valeur négative non autorisée: " + valeur);
        this.valeurErronee = valeur;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
