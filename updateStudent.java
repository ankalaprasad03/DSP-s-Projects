package student;

import java.util.Scanner;
import System.Service;

public class updateStudent {

    public static void update() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (student s : Service.students) {

            if (s.id == id) {

                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                s.course = sc.nextLine();

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}