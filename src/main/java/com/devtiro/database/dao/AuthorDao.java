package com.devtiro.database.dao;

import java.util.List;
import java.util.Optional;

import com.devtiro.database.domain.Author;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();

    void update(Long id, Author author);
}
