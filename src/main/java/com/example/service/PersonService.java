package com.example.service;

import java.util.List;

import com.example.dao.PersonDao;
import com.example.modal.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonService {
    private PersonDao personDao;

    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }
}
