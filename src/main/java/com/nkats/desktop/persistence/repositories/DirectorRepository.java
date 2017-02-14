package com.nkats.desktop.persistence.repositories;

import com.nkats.desktop.persistence.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nikos Katsikogiannis
 */
public interface DirectorRepository extends JpaRepository<Director, Integer> {
}
