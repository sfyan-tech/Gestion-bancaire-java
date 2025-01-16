import java.util.ArrayList;
import java.util.List;

public class Client {
    private int identifiant; // Identifiant unique du client
    private String nom;
    private String prenom;
    private List<CompteCourant> comptesCourants;
    private CompteEpargne compteEpargne;

    public Client(int identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.comptesCourants = new ArrayList<>();
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public boolean ajouterCompteCourant(CompteCourant compte) {
        if (comptesCourants.size() < 3) {
            comptesCourants.add(compte);
            return true;
        }
        return false;
    }

    public boolean ajouterCompteEpargne(CompteEpargne compte) {
        if (this.compteEpargne == null) {
            this.compteEpargne = compte;
            return true;
        }
        return false;
    }

    public void consulter() {
        System.out.println("Client ID: " + identifiant);
        System.out.println("Nom: " + nom + " " + prenom);
        System.out.println("Comptes Courants :");
        for (CompteCourant cc : comptesCourants) {
            System.out.println("- Compte Courant ID: " + cc.getIdentifiant() + ", Solde: " + cc.getSolde() + ", Découvert: " + cc.getDecouvert());
        }
        if (compteEpargne != null) {
            System.out.println("Compte Epargne :");
            System.out.println("- Compte Epargne ID: " + compteEpargne.getIdentifiant() + ", Solde: " + compteEpargne.getSolde() + ", Taux d'intérêt: " + compteEpargne.getTauxInteret());
        }
    }
}

