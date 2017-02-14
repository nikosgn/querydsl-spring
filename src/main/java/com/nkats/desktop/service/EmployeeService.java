package com.nkats.desktop.service;

import com.nkats.desktop.persistence.entities.Employee;
import com.nkats.desktop.persistence.repositories.EmployeeRepository;
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
@RequestMapping("/employee")
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
