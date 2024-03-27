package net.codejava.services;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {

    private final JdbcTemplate jdbcTemplate;

    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void deleteUser(String userId) {
        String sql = "DELETE FROM users WHERE id = '" + userId + "'";
        jdbcTemplate.execute(sql);
    }

//    String sql = "DELETE FROM users WHERE id = ?";
//        jdbcTemplate.update(sql, userId);
}