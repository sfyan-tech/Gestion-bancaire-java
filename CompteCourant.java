public class CompteCourant extends Compte implements OperationAvancee {
    private float decouvert;

    public CompteCourant(int identifiant, float solde, float decouvert) {
        super(identifiant, solde);
        this.decouvert = decouvert;
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public boolean debiter(int somme) {
        if (somme > 0 && (this.solde - somme >= -decouvert)) {
            this.solde -= somme;
            return true;
        }
        return false;
    }

    @Override
    public boolean virement(Compte beneficiaire, int somme) {
        if (this.debiter(somme)) {
            beneficiaire.crediter(somme);
            return true;
        }
        return false;
    }
}

