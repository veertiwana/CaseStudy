package com.training.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.intercomm.StudentClient;
import com.training.springboot.model.Course;
import com.training.springboot.model.Student;
import com.training.springboot.repository.CourseRepository;


@RestController
@RequestMapping("/courseapi")
public class CourseController {

    private final CourseRepository courseRepository;

    @Autowired
    CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Autowired
    StudentClient studClient;
    
    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<Course> getCourse() {
        return new ResponseEntity(courseRepository.findAll(),HttpStatus.OK);
//		return Arrays.asList(new Course[] {new Course(23, "Sports", "Harsh", 20)});
    }
    @PostMapping("/post")
    public void postCourse(@RequestBody Course c) {
    	courseRepository.save(c);
    }
    
    @GetMapping("/service/stud/{studId}")
    public Student getStud(@PathVariable int studId) {
    	return studClient.getStudent(studId);
    }
}

