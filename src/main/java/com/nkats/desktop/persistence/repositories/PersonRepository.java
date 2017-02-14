package com.nkats.desktop.persistence.repositories;

import com.nkats.desktop.persistence.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nikos Katsikogiannis
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
