package com.leverx.service;

import com.leverx.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeopleService {

    List<Person> findAllUsers();

    Person findUserById(int id);
}
