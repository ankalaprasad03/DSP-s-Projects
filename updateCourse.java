package course;

import java.util.Scanner;
import System.Service;

public class updateCourse {

    public static void update() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (course c : Service.courses) {

            if (c.id == id) {

                System.out.print("Enter New Course Name: ");
                c.name = sc.nextLine();

                System.out.print("Enter New Duration: ");
                c.duration = sc.nextLine();

                System.out.print("Enter New Fee: ");
                c.fee = sc.nextDouble();

                System.out.println("Course updated successfully!");
                return;
            }
        }

        System.out.println("Course not found!");
    }
}