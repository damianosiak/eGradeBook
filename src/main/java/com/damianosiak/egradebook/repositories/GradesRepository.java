package com.damianosiak.egradebook.repositories;

import com.damianosiak.egradebook.model.Grades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends CrudRepository<Grades, Long> {
}
