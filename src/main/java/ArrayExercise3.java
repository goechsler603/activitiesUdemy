//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.


import java.util.Locale;
import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer n;

        System.out.println("How many heights and genders do you want to enter? ");
        n = sc.nextInt();

        Double[] heights = new Double[n];
        String[] gender = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the height " + (i + 1) + ":");
            heights[i] = sc.nextDouble();
            System.out.println("Enter the gender (M, F) " + (i + 1) + ":");
            gender[i] = sc.next();

        }

        System.out.printf("The biggest height is: %.2f%n", biggest(heights));
        System.out.printf("The smallest height is: %.2f%n", smallest(heights));
        System.out.printf("The average F height is: %f%n", averageF(heights, gender));
        System.out.printf("The quantity of M is: %.1f%n", qntM(gender));

    }

    public static double biggest(Double[] heights) {
        double biggest = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > biggest) {
                biggest = heights[i];
            }
        }
        return biggest;
    }

    public static double smallest(Double[] heights) {
        double smallest = 100000;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < smallest) {
                smallest = heights[i];
            }
        }
        return smallest;
    }

    public static double averageF(Double[] heights, String[] genders) {
        double average = 0;
        int aux = 0;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i].equals("F")) {
                aux++;
                average += heights[i];
            }
        }
        average = average / aux;
        return average;
    }

    public static double qntM(String[] genders) {
        int qntM = 0;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i].equals("M")) {
                qntM++;
            }
        }
        return qntM;
    }


}

