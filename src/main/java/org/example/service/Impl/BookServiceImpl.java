package org.example.service.Impl;

import org.example.dto.BookDTO;
import org.example.entity.Book;
import org.example.mapper.BookMapper;
import org.example.repository.BookRepository;
import org.example.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(BookDTO bookDTO) {
        Book book = BookMapper.toEntity(bookDTO);
        bookRepository.addBook(book);
    }

    @Override
    public List<BookDTO> getAvailableBooks() {
        return bookRepository.getAvailableBooks().stream()
                .map(BookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookDTO> searchBook(String query) {
        return bookRepository.searchBook(query).stream()
                .map(BookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public boolean borrowBook(String isbn) {
        return bookRepository.borrowBook(isbn);
    }

    @Override
    public boolean returnBook(String isbn) {
        return bookRepository.returnBook(isbn);
    }

    @Override
    public List<BookDTO> getBorrowedBooks() {
        return bookRepository.getBorrowedBooks().stream()
                .map(BookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteBook(String isbn) {
        return bookRepository.deleteBook(isbn);
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        Book book = BookMapper.toEntity(bookDTO);
        bookRepository.updateBook(book);
    }

    @Override
    public BookDTO getBookByIsbn(String isbn) {
        Book book = bookRepository.getBookByIsbn(isbn);
        return BookMapper.toDTO(book);
    }
}
