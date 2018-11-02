package institution.interlink;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;

public class Internship {

    private String name;

    private Knowledge minKnowledge;

    private List<Student> students = new LinkedList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setMinKnowledge(Knowledge minKnowledge) {
        this.minKnowledge = minKnowledge;
    }

    public Knowledge getMinKnowledge(){
        return minKnowledge;
    }

    public boolean addStudent(Student student) {
        if(student.getKnowledge().getLevel() >= minKnowledge.getLevel()){
            students.add(student);
            return true;
        }
        return false;
    }

    public String getStudentNames() {
        String studentNames = "";
        for(Student s : students) {
            studentNames += s.getName();
            studentNames += "\n";
        }
        return studentNames;
    }
}
