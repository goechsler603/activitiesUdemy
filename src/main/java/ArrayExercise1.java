// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.


import java.util.Random;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {

        Integer n;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.println("How many numbers do you want to enter? (Max = 10)");
            n = sc.nextInt();
        } while (n > 10 || n < 0);

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100;
            for (int j : arr) {
                if (arr[i] < 0) {
                    System.out.println("Array[" + i + "] is negative = " + arr[i] + " ");
                }
                break;
            }
        }
    }
}
