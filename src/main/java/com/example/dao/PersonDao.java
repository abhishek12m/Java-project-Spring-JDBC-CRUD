package com.example.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.mapper.PersonRowMapper;
import com.example.modal.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDao {
    private JdbcTemplate jdbcTemplate;


    public void addPerson(Person person) {
        String sql = "INSERT INTO person (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, person.getName(), person.getEmail());
    }

    public List<Person> getAllPersons() {
        String sql = "SELECT * FROM person";
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }
}
