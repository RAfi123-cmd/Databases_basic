package com.devtiro.database.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.devtiro.database.dao.BookDao;
import com.devtiro.database.domain.Book;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Book book) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)",
                book.getIsbn(), book.getTitle(), book.getAuthorId());
    }

}
