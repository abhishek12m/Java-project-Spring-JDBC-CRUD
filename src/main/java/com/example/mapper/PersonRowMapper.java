package com.example.mapper;
import org.springframework.jdbc.core.RowMapper;

import com.example.modal.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setName(rs.getString("name"));
        person.setEmail(rs.getString("email"));
        return person;
    }
}
