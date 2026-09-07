package student;

import System.Service;

public class ViewStudent {

    public static void view() {

        if (Service.students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        for (student s : Service.students) {

            System.out.println("Student ID: " + s.id);
            System.out.println("Student Name: " + s.name);
            System.out.println("Student Age: " + s.age);
            System.out.println("Course: " + s.course);
            System.out.println("--------------------");
        }
    }
}