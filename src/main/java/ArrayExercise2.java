// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.


import java.util.Locale;
import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {

        Integer n;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many persons do you want to enter?");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        Double[] heights = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("What is the name of the " + (i+1) + " person?");
            names[i] = sc.next();
            System.out.println("What is the age of the " + (i+1) + " person?");
            ages[i] = sc.nextInt();
            System.out.println("How tall is the " + (i+1) + " person?");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Average height: " + averageHeight(heights));
        System.out.printf("Persons under 16 years old: %.1f%%%n", percent(ages));

       printNames(ages, names);
    }

    //Function

    public static void printNames(int[] ages, String names[]) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }
    }

    public static double percent(int ages[]) {
        int aux = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16) {
                aux += 1;
            }
        }
        double percent = (aux * 100)/ ages.length;
        return percent;
    }

    public static double averageHeight(Double[] heights) {
        double avaregeHeight = 0;
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
            avaregeHeight = sum / heights.length;
        }
        return avaregeHeight;
    }

}
