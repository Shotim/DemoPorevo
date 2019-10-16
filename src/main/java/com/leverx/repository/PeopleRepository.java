package com.leverx.repository;

import com.leverx.entity.Person;

import java.util.List;

public interface PeopleRepository {
    List<Person> findAllUsers();

    Person findUserById(int id);
}
