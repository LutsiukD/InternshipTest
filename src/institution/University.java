package institution;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;

    private List<Student> students = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    
    public float getEverageKnowledge() {
    	float sum = 0;
    	float EverageKnowledge;  
    	for(Student student: this.getStudents()) {
    		sum += student.getKnowledge().getLevel();
    	}
    	EverageKnowledge = sum/students.size();
    	return EverageKnowledge;
    }
}
