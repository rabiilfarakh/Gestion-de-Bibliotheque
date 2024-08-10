package org.example.repository;

import org.example.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAvailableBooks() {
        return books.stream()
                .filter(book -> "available".equals(book.getStatus()))
                .toList();
    }

    public List<Book> searchBook(String query) {
        return books.stream()
                .filter(book -> book.getTitle().contains(query) || book.getAuthor().contains(query))
                .toList();
    }

    public boolean borrowBook(String isbn) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getIsbn().equals(isbn) && "available".equals(b.getStatus()))
                .findFirst();
        if (book.isPresent()) {
            book.get().setStatus("borrowed");
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Optional<Book> book = books.stream()
                .filter(b -> b.getIsbn().equals(isbn) && "borrowed".equals(b.getStatus()))
                .findFirst();
        if (book.isPresent()) {
            book.get().setStatus("available");
            return true;
        }
        return false;
    }

    public List<Book> getBorrowedBooks() {
        return books.stream()
                .filter(book -> "borrowed".equals(book.getStatus()))
                .toList();
    }

    public boolean deleteBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void updateBook(Book book) {
        // Find the book and update
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(book.getIsbn())) {
                books.set(i, book);
                return;
            }
        }
    }

    public Book getBookByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }
}
