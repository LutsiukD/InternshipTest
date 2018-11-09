package provider;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;

public class SampleStudentProvider {

    public List<Student> getAllStudents() {

        List<Student> students = new LinkedList<>();

        Student s1 = new Student("Andrew Kostenko");
        Student s2 = new Student("Julia Veselkina");
        Student s3 = new Student("Maria Perechrest");
        Student s4 = new Student("Dmytro Lutsiuk");
        Student s5 = new Student("Ivan Petriv ");

        s1.setKnowledge(new Knowledge(1));
        s2.setKnowledge(new Knowledge(3));
        s3.setKnowledge(new Knowledge(3));
        s4.setKnowledge(new Knowledge(4));
	s5.setKnowledge(new Knowledge(5));

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
	students.add(s5);

        return students;
    }
}
