package org.example.mapper;

import org.example.dto.BookDTO;
import org.example.entity.Book;

public class BookMapper {
    // Convertir BookDTO en Book
    public static Book toEntity(BookDTO bookDTO) {
        if (bookDTO == null) {
            return null;
        }
        Book book = new Book();
        book.setIsbn(bookDTO.getIsbn());
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setStatus(bookDTO.getStatus());
        return book;
    }

    // Convertir Book en BookDTO
    public static BookDTO toDTO(Book book) {
        if (book == null) {
            return null;
        }
        BookDTO bookDTO = new BookDTO();
        bookDTO.setIsbn(book.getIsbn());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setStatus(book.getStatus());
        return bookDTO;
    }
}
