package main;

import provider.SampleStudentProvider;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");

        SampleStudentProvider provider = new SampleStudentProvider();

        for(Student student : provider.getAllStudents()) {
            university.addStudent(student);
        }

        Internship internship = new Internship("Interlink");
        internship.setMinKnowledge(new Knowledge(3));

        for(Student student : university.getStudents()){
            boolean enrolledInInternShip = internship.addStudent(student);
            if (enrolledInInternShip) {
                System.out.println("Student " + student.getName() + " enrolled to internship");
            } else {
                System.out.println("Student " + student.getName() + " not enrolled to internship");
            }
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudentNames());
    }


}
