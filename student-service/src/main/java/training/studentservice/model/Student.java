package training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="STUD")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String studName;
	private int age;
	@Column(name="stud_grade")
	private String grade;
	
	
	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	public Student(String studName, int age, String grade){
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}