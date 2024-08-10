package org.example.mapper;

import org.example.dto.BookDTO;
import org.example.entity.Book;

public class BookMapper {
    public static BookDTO toDTO(Book book) {
        if (book == null) {
            return null;
        }
        return new BookDTO(book.getIsbn(), book.getTitle(), book.getAuthor(), book.getStatus());
    }

    public static Book toEntity(BookDTO bookDTO) {
        if (bookDTO == null) {
            return null;
        }
        return new Book(bookDTO.getIsbn(), bookDTO.getTitle(), bookDTO.getAuthor(), bookDTO.getStatus());
    }
}
