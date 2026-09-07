package System;

import java.util.Scanner;

import student.AddStudent;
import student.ViewStudent;
import student.updateStudent;

import course.addCourse;
import course.viewCourse;
import course.updateCourse;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("===== MANAGEMENT SYSTEM =====");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            // Student Management
            if (choice == 1) {

                while (true) {

                    System.out.println();
                    System.out.println("===== STUDENT MANAGEMENT =====");
                    System.out.println("1. Add Student");
                    System.out.println("2. View Student");
                    System.out.println("3. Update Student");
                    System.out.println("4. Delete Student");
                    System.out.println("5. Back");
                    System.out.print("Enter your choice: ");

                    int ch = sc.nextInt();

                    if (ch == 1) {
                        AddStudent.add();
                    }

                    else if (ch == 2) {
                        ViewStudent.view();
                    }

                    else if (ch == 3) {
                        updateStudent.update();
                    }

                    else if (ch == 4) {

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        for (int i = 0; i < Service.students.size(); i++) {

                            if (Service.students.get(i).id == id) {

                                Service.students.remove(i);

                                System.out.println("Student deleted successfully!");
                                break;
                            }

                            if (i == Service.students.size() - 1) {
                                System.out.println("Student not found!");
                            }
                        }
                    }

                    else if (ch == 5) {
                        break;
                    }

                    else {
                        System.out.println("Invalid choice!");
                    }
                }
            }

            // Course Management
            else if (choice == 2) {

                while (true) {

                    System.out.println();
                    System.out.println("===== COURSE MANAGEMENT =====");
                    System.out.println("1. Add Course");
                    System.out.println("2. View Course");
                    System.out.println("3. Update Course");
                    System.out.println("4. Delete Course");
                    System.out.println("5. Back");
                    System.out.print("Enter your choice: ");

                    int ch = sc.nextInt();

                    if (ch == 1) {
                        addCourse.add();
                    }

                    else if (ch == 2) {
                        viewCourse.view();
                    }

                    else if (ch == 3) {
                        updateCourse.update();
                    }

                    else if (ch == 4) {

                        System.out.print("Enter Course ID: ");
                        int id = sc.nextInt();

                        for (int i = 0; i < Service.courses.size(); i++) {

                            if (Service.courses.get(i).id == id) {

                                Service.courses.remove(i);

                                System.out.println("Course deleted successfully!");
                                break;
                            }

                            if (i == Service.courses.size() - 1) {
                                System.out.println("Course not found!");
                            }
                        }
                    }

                    else if (ch == 5) {
                        break;
                    }

                    else {
                        System.out.println("Invalid choice!");
                    }
                }
            }

            // Exit
            else if (choice == 3) {

                System.out.println("Thank you!");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}