package com.leverx.service;

import com.leverx.repository.PeopleRepository;
import com.leverx.entity.Person;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    //@Autowired
    private PeopleRepository peopleRepository;

    @Override
    public List<Person> findAllUsers() {
        return peopleRepository.findAllUsers();
    }

    @Override
    public Person findUserById(int id) {
        return peopleRepository.findUserById(id);
    }
}
