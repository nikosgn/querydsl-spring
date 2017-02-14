package com.nkats.desktop.persistence.repositories;

import com.nkats.desktop.persistence.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nikos Katsikogiannis
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
