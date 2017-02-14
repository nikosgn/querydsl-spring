package com.nkats.desktop.service;

import com.nkats.desktop.persistence.entities.Person;
import com.nkats.desktop.persistence.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nikos Katsikogiannis
 */
@RestController
@RequestMapping("/person")
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
