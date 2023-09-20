package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springboot.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}

