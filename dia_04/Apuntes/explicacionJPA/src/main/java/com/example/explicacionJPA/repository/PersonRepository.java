package com.example.explicacionJPA.repository;

import com.example.explicacionJPA.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/*El repository posee los metodos*/
public interface PersonRepository extends JpaRepository<Person, Long> {

}
