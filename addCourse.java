package course;

import java.util.Scanner;
import System.Service;

public class addCourse {

    public static void add() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Duration: ");
        String duration = sc.nextLine();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();

        course c = new course(id, name, duration, fee);

        Service.courses.add(c);

        System.out.println("Course added successfully!");
    }
}