package course;

import System.Service;

public class viewCourse {

    public static void view() {

        if (Service.courses.isEmpty()) {

            System.out.println("No courses available!");

            return;
        }

        for (course c : Service.courses) {

            System.out.println("Course ID: " + c.id);
            System.out.println("Course Name: " + c.name);
            System.out.println("Duration: " + c.duration);
            System.out.println("Fee: " + c.fee);
            System.out.println("--------------------");
        }
    }
}