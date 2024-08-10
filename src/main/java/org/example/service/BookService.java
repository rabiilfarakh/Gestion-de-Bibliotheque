package org.example.service;

import org.example.dto.BookDTO;

import java.util.List;

public interface BookService {
    void addBook(BookDTO bookDTO);
    List<BookDTO> getAvailableBooks();
    List<BookDTO> searchBook(String query);
    boolean borrowBook(String isbn);
    boolean returnBook(String isbn);
    List<BookDTO> getBorrowedBooks();
    boolean deleteBook(String isbn);
    void updateBook(BookDTO bookDTO);
    BookDTO getBookByIsbn(String isbn);
}
