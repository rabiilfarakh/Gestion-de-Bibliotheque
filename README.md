# Library Management System

## Contexte du Projet

La bibliothèque municipale de la ville de Paris rencontre plusieurs problèmes liés à la gestion manuelle des livres et à l'absence d'un système de suivi efficace. Ces problèmes se traduisent particulièrement par les difficultés suivantes :

- **Gestion Inefficace** : Les bibliothécaires doivent effectuer toutes les tâches liées à la gestion des livres manuellement, ce qui peut entraîner des erreurs et une perte de temps. Il est difficile de maintenir une base de données à jour et de suivre l'état de chaque livre (disponible ou emprunté).
  
- **Difficultés de Recherche** : Les utilisateurs de la bibliothèque ont du mal à trouver les livres qu'ils souhaitent emprunter. L'absence d'un système de recherche efficace rend la recherche fastidieuse et peut décourager les utilisateurs.
  
- **Manque de Statistiques** : Il n'existe aucun moyen facile d'obtenir des statistiques sur les livres disponibles, les livres empruntés et les livres perdus. Cela limite la capacité de la bibliothèque à analyser et à optimiser ses collections.

En résumé, le besoin est de développer une application console de gestion des bibliothèques en Java, qui permettra une gestion automatisée des livres, une recherche efficace, une gestion des emprunts et des retours, ainsi que la génération de rapports statistiques. Cette application vise à résoudre les problèmes de gestion inefficace et de difficulté de recherche rencontrés par la bibliothèque, tout en améliorant l'expérience des utilisateurs.

## Fonctionnalités

- **Gestion Automatisée des Livres** : Ajouter, mettre à jour, supprimer des livres.
- **Système de Recherche Efficace** : Rechercher des livres par titre ou auteur.
- **Gestion des Emprunts et des Retours** : Enregistrer les emprunts et les retours de livres.
- **Génération de Rapports Statistiques** : Générer des rapports sur les livres disponibles, empruntés et perdus.

## Historique des Utilisateurs

- **Ajouter un Livre** : Permet d'ajouter un nouveau livre à la bibliothèque avec son titre, auteur, et numéro ISBN.
- **Afficher les Livres Disponibles** : Affiche la liste des livres disponibles dans la bibliothèque.
- **Rechercher un Livre** : Recherche des livres par titre ou auteur.
- **Emprunter un Livre** : Permet d'emprunter un livre en fournissant son numéro ISBN.
- **Retourner un Livre** : Permet de retourner un livre emprunté en fournissant son numéro ISBN.
- **Afficher les Livres Empruntés** : Affiche la liste des livres actuellement empruntés.
- **Supprimer un Livre** : Supprime un livre de la bibliothèque en fournissant son numéro ISBN.
- **Modifier un Livre** : Modifie les informations d'un livre existant en fournissant son numéro ISBN.
- **Générer un Rapport** : Génère un rapport contenant des statistiques sur les livres disponibles, empruntés et perdus.

## Installation

1. **Clonez le dépôt** :

    ```bash
    git clone https://github.com/rabiilfarakh/Gestion-de-Bibliotheque.git
    ```

2. **Accédez au répertoire du projet** :

    ```bash
    cd Gestion-de-Bibliotheque
    ```

3. **Compilez le projet** :

    Utilisez Maven pour compiler le projet. Assurez-vous d'avoir JDK installé.

    Avec Maven :
    ```bash
    mvn clean install
    ```

4. **Exécutez l'application** :

    ```bash
    java -cp target/Gestion-de-Bibliotheque-1.0.jar com.example.LibraryManager
    ```

## Utilisation

L'application se lance en mode console et permet d'effectuer les opérations suivantes via un menu interactif :

- Ajouter un livre
- Afficher les livres disponibles
- Rechercher un livre
- Emprunter un livre
- Retourner un livre
- Afficher les livres empruntés
- Supprimer un livre
- Modifier un livre
- Générer un rapport

## Exigences

- JDK 11 ou version ultérieure
- Maven

