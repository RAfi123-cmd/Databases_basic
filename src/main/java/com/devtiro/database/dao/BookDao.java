package com.devtiro.database.dao;

import java.util.Optional;

import com.devtiro.database.domain.Book;

public interface BookDao {

    void create(Book book);

    Optional<Book> find(String isbn);
}
