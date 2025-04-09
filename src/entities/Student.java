package entities;

import java.util.Scanner;

public class Student {

    public String name;
    public double gradeFirstB = 40;
    public double gradeSecondB = 40;
    public double gradeThirdB = 40;

    public void grades() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + "'s first grade: ");
        while (gradeFirstB > 30) {
            gradeFirstB = sc.nextDouble();
        }
        System.out.print("Enter " + name + "'s second grade: ");
        while (gradeSecondB > 35) {
            gradeSecondB = sc.nextDouble();
        }
        System.out.print("Enter " + name + "'s third grade: ");
        while (gradeThirdB > 35) {
            gradeThirdB = sc.nextDouble();
        }

    }

    public double finalGrade() {

        return gradeFirstB + gradeSecondB + gradeThirdB;
    }

    public String aprovation() {

        if (finalGrade() < 60) {

            double missingPoints = 60 - finalGrade();
            return "Final grade: " + finalGrade() + "\nFAILED  \nMISSING POINTS: " + missingPoints;

        }else return "APPROVED";
    }

}
