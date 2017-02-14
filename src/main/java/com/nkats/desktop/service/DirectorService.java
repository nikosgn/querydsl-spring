package com.nkats.desktop.service;

import com.nkats.desktop.persistence.entities.Director;
import com.nkats.desktop.persistence.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nikos Katsikogiannis
 */
@RestController
@RequestMapping("/director")
@Transactional
public class DirectorService {
    @Autowired
    private DirectorRepository directorRepository;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }
}
