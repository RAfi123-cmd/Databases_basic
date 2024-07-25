package com.devtiro.database.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.devtiro.database.dao.AuthorDao;
import com.devtiro.database.domain.Author;

public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",
                author.getId(), author.getName(), author.getAge());
    }

}
