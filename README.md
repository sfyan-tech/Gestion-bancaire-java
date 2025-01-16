# Gestion Bancaire en Java

Ce projet est une application Java simple pour la gestion de comptes bancaires. Il a été conçu pour modéliser le fonctionnement d'une banque avec des fonctionnalités de base telles que la gestion des clients, des comptes bancaires et des opérations financières.

## Fonctionnalités

- **Gestion des comptes bancaires :**
  - Compte courant avec gestion de découvert.
  - Compte épargne avec taux d'intérêt.
- **Opérations financières :**
  - Créditer un compte.
  - Débiter un compte (avec vérification des règles de découvert ou de solde minimal).
  - Effectuer des virements entre comptes.
- **Gestion des clients :**
  - Chaque client peut avoir jusqu'à trois comptes courants et un compte épargne.
  - Consultation des informations du client et de ses comptes.

## Structure du projet

- **Classes principales :**
  - `Compte` : Classe abstraite pour les comptes bancaires.
  - `CompteCourant` : Implémentation pour les comptes courants avec gestion de découvert.
  - `CompteEpargne` : Implémentation pour les comptes épargne avec gestion des taux d'intérêt.
  - `Client` : Gestion des informations client et des comptes associés.
  - `Main` : Point d'entrée pour tester l'application.
- **Interfaces :**
  - `OperationSimple` : Interface pour les opérations de base (créditer, débiter).
  - `OperationAvancee` : Interface pour les opérations avancées (virements).

