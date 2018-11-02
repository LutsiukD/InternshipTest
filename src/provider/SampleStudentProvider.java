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

        Knowledge lowKnowledge = new Knowledge(1);
        Knowledge higherThanMediumKnowledge = new Knowledge(3);

        s1.setKnowledge(lowKnowledge);
        s2.setKnowledge(higherThanMediumKnowledge);
        s3.setKnowledge(higherThanMediumKnowledge);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        return students;
    }
}
