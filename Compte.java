

public abstract class Compte implements OperationSimple {
    protected int identifiant;
    protected float solde;

    public Compte(int identifiant, float solde) {
        this.identifiant = identifiant;
        this.solde = solde;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public void crediter(int somme) {
        if (somme > 0) {
            this.solde += somme;
        }
    }

    @Override
    public abstract boolean debiter(int somme);
}
