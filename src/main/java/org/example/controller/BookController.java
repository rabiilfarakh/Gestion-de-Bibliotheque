package org.example.controller;

import org.example.dto.BookDTO;
import org.example.service.BookService;

import java.util.List;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(BookDTO bookDTO) {
        bookService.addBook(bookDTO);
    }

    public List<BookDTO> getAvailableBooks() {
        return bookService.getAvailableBooks();
    }

    public List<BookDTO> searchBook(String query) {
        return bookService.searchBook(query);
    }

    public boolean borrowBook(String isbn) {
        return bookService.borrowBook(isbn);
    }

    public boolean returnBook(String isbn) {
        return bookService.returnBook(isbn);
    }

    public List<BookDTO> getBorrowedBooks() {
        return bookService.getBorrowedBooks();
    }

    public boolean deleteBook(String isbn) {
        return bookService.deleteBook(isbn);
    }

    public void updateBook(BookDTO bookDTO) {
        bookService.updateBook(bookDTO);
    }

    public BookDTO getBookByIsbn(String isbn) {
        return bookService.getBookByIsbn(isbn);
    }
}
