package net.salatschuessel.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer countAll() {
        return jdbcTemplate.queryForObject("select count(*) from test", Integer.class);
    }

    public void insert(int test) {
        jdbcTemplate.update("insert into test (test) values(?)", test);
    }
}