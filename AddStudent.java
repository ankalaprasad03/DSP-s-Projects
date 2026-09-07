package student;

import java.util.Scanner;
import System.Service;

public class AddStudent {

    public static void add() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        student s = new student(id, name, age, course);

        Service.students.add(s);

        System.out.println("Student added successfully!");
    }
}