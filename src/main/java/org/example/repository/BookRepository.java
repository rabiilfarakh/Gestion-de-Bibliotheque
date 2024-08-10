package org.example.repository;

import org.example.entity.Book;
import org.example.orm.BookORM;

import java.sql.SQLException;
import java.util.List;

public class BookRepository {
    private final BookORM bookORM = new BookORM();

    public void addBook(Book book) {
        try {
            bookORM.addBook(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAvailableBooks() {
        try {
            return bookORM.getAvailableBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    public List<Book> searchBook(String query) {
        try {
            return bookORM.searchBook(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    public boolean borrowBook(String isbn) {
        try {
            return bookORM.borrowBook(isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        try {
            return bookORM.returnBook(isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Book> getBorrowedBooks() {
        try {
            return bookORM.getBorrowedBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    public boolean deleteBook(String isbn) {
        try {
            return bookORM.deleteBook(isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void updateBook(Book book) {
        try {
            bookORM.updateBook(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book getBookByIsbn(String isbn) {
        try {
            return bookORM.getBookByIsbn(isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
