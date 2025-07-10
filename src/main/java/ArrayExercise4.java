
//A dona de um pensionato possui 10 quartos para alugar para estudantes, sendo esses quartos identificados pelos numero de 0 a 9.
//Fazer um programa que inicie com todos os 10 quartos vazios, e depois leia uma quantidade N representando o numero de estudantes
//que vao alugar os quartos(N pode ser de 1 a 10). Em seguida, registre os alugueis dos estudantes, bem como os quartos que eles
//escolheram (De 0 a 9). Suponha que o quarto escolhido esteja vago. ao final do programa, imprimir o relatorio de todas as ocupacoes.

import java.util.Locale;
import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer rooms[] = new Integer[10];
        Integer students = 11;
        String studentName[] = new String[10];
        String studentEmail[] = new String[10];
        Integer i;


        while (students > 10 || students < 1) {
            System.out.println("Quantos quartos serao alugados ? (De 1 a 10)");
            students = sc.nextInt();
        }

        for (i = 0; i < students; i++) {
            Integer aux = 11;
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.println("Qual quarto deseja alugar? (0 a 9)");
            while (aux > 9 || aux < 0) {
                aux = sc.nextInt();
            }
            rooms[aux] = aux;
            System.out.println("Qual seu nome?");
            studentName[aux] = sc.next();
            System.out.println("Qual seu email?");
            studentEmail[aux] = sc.next();
        }
        for (i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i] + " - " + studentName[i] + " - " + studentEmail[i]);
            }
        }
    }
}

