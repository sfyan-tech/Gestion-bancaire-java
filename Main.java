
public class Main {
    public static void main(String[] args) {
        // Création du client
        Client client = new Client(1, "lionel", "Messi");

        // Création des comptes
        CompteCourant cc1 = new CompteCourant(101, 500, 200);
        CompteCourant cc2 = new CompteCourant(102, 1000, 300);
        CompteEpargne ce = new CompteEpargne(201, 2000, 2.5f);

        // Ajout des comptes au client
        client.ajouterCompteCourant(cc1);
        client.ajouterCompteCourant(cc2);
        client.ajouterCompteEpargne(ce);

        // Consultation des informations du client
        client.consulter();

        // Effectuer des opérations
        cc1.debiter(600); // Débiter un compte courant
        cc2.virement(ce, 200); // Virement d'un compte courant vers un compte épargne

        // Consultation après opérations
        client.consulter();
    }
}
