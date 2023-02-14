package com.greatlearning.srs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.srs.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}