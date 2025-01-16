public class CompteEpargne extends Compte {
    private float tauxInteret;

    public CompteEpargne(int identifiant, float solde, float tauxInteret) {
        super(identifiant, solde);
        this.tauxInteret = tauxInteret;
    }

    public float getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(float tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public boolean debiter(int somme) {
        if (somme > 0 && (this.solde - somme >= 0)) {
            this.solde -= somme;
            return true;
        }
        return false;
    }
}
