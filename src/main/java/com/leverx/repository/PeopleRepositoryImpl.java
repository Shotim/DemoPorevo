package com.leverx.repository;

import com.leverx.entity.Person;
import com.leverx.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@AllArgsConstructor
public class PeopleRepositoryImpl implements PeopleRepository {

    private final String FIND_ALL_USERS = "SELECT * FROM people";
    private final String FIND_USER_BY_ID = "SELECT * FROM people WHERE id = ?";

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Person> findAllUsers() {
        return template.query(FIND_ALL_USERS, new UserMapper());
    }

    @Override
    public Person findUserById(int id) {
        return template.queryForObject(FIND_USER_BY_ID, new UserMapper(), id);
    }
}
