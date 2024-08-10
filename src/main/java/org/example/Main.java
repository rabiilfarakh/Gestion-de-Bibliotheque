package org.example;

import org.example.controller.BookController;
import org.example.dto.BookDTO;
import org.example.service.BookService;
import org.example.service.Impl.BookServiceImpl;
import org.example.repository.BookRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final BookService bookService = new BookServiceImpl(new BookRepository());
    private static final BookController bookController = new BookController(bookService);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu Bibliothèque ===");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres disponibles");
            System.out.println("3. Rechercher un livre");
            System.out.println("4. Emprunter un livre");
            System.out.println("5. Retourner un livre");
            System.out.println("6. Afficher les livres empruntés");
            System.out.println("7. Supprimer un livre");
            System.out.println("8. Modifier un livre");
            System.out.println("9. Quitter");
            System.out.print("Choisissez une option (1-9) : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice) {
                case 1:
                    // Ajouter un livre
                    System.out.print("ISBN : ");
                    String isbn = scanner.nextLine();
                    System.out.print("Titre : ");
                    String title = scanner.nextLine();
                    System.out.print("Auteur : ");
                    String author = scanner.nextLine();
                    System.out.print("Statut (available/borrowed) : ");
                    String status = scanner.nextLine();

                    BookDTO newBook = new BookDTO(isbn, title, author, status);
                    bookController.addBook(newBook);
                    System.out.println("Livre ajouté avec succès.");
                    break;

                case 2:
                    // Afficher les livres disponibles
                    System.out.println("Livres disponibles : ");
                    List<BookDTO> availableBooks = bookController.getAvailableBooks();
                    availableBooks.forEach(book -> System.out.println(book.getTitle() + " par " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")"));
                    break;

                case 3:
                    // Rechercher un livre
                    System.out.print("Entrez le titre ou l'auteur à rechercher : ");
                    String query = scanner.nextLine();

                    List<BookDTO> searchedBooks = bookController.searchBook(query);
                    searchedBooks.forEach(book -> System.out.println(book.getTitle() + " par " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")"));
                    break;

                case 4:
                    // Emprunter un livre
                    System.out.print("Entrez l'ISBN du livre à emprunter : ");
                    String borrowIsbn = scanner.nextLine();

                    boolean isBorrowed = bookController.borrowBook(borrowIsbn);
                    System.out.println("Livre emprunté : " + isBorrowed);
                    break;

                case 5:
                    // Retourner un livre
                    System.out.print("Entrez l'ISBN du livre à retourner : ");
                    String returnIsbn = scanner.nextLine();

                    boolean isReturned = bookController.returnBook(returnIsbn);
                    System.out.println("Livre retourné : " + isReturned);
                    break;

                case 6:
                    // Afficher les livres empruntés
                    System.out.println("Livres empruntés : ");
                    List<BookDTO> borrowedBooks = bookController.getBorrowedBooks();
                    borrowedBooks.forEach(book -> System.out.println(book.getTitle() + " par " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")"));
                    break;

                case 7:
                    // Supprimer un livre
                    System.out.print("Entrez l'ISBN du livre à supprimer : ");
                    String deleteIsbn = scanner.nextLine();

                    boolean isDeleted = bookController.deleteBook(deleteIsbn);
                    System.out.println("Livre supprimé : " + isDeleted);
                    break;

                case 8:
                    // Modifier un livre
                    System.out.print("Entrez l'ISBN du livre à modifier : ");
                    String modifyIsbn = scanner.nextLine();
                    System.out.print("Nouveau titre : ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Nouvel auteur : ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Nouveau statut (disponible/emprunté) : ");
                    String newStatus = scanner.nextLine();

                    BookDTO updatedBook = new BookDTO(modifyIsbn, newTitle, newAuthor, newStatus);
                    bookController.updateBook(updatedBook);
                    System.out.println("Livre mis à jour avec succès.");
                    break;

                case 9:
                    // Quitter
                    System.out.println("Merci d'avoir utilisé le système de gestion de bibliothèque !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choice != 9);

        scanner.close();
    }
}
