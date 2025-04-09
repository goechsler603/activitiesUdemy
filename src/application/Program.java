package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    Student student = new Student();
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter student name: ");
    student.name = sc.nextLine();

    student.grades();

    student.finalGrade();

    System.out.println(student.aprovation());

    }
}
