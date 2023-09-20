package training.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import training.studentservice.model.Student;

/**
 * 
 * @author user
 * StudentRepository extends JpaRepository so that CRUD operations
 * can be performed by using Repository methods.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}