package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.modal.Person;
import com.example.service.PersonService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the PersonService bean
        PersonService personService = (PersonService) context.getBean("personService");

        // Test case: Add a person
        Person personToAdd = new Person();
        personToAdd.setName("Abhishek Maheshwari");
        personToAdd.setEmail("abhishek.maheshwari@capgemini.com");
        personService.addPerson(personToAdd);

        // Test case: Retrieve all persons
        List<Person> allPersons = personService.getAllPersons();
        for (Person person : allPersons) {
            System.out.println("Name: " + person.getName() + ", Email: " + person.getEmail());
        }
    }
}
