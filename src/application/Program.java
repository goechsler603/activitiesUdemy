package application;

import entities.BankAccount;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Lets create your account:");
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your account number:");
        int accountNumber = sc.nextInt();
        BankAccount account1;

        while (true) {
            String answer;
            System.out.print("Do you want to deposit? Y/N: ");
            answer = sc.nextLine().toUpperCase();

            if (answer.equals("Y")) {
                System.out.print("Enter your first deposit amount: ");
                double firstDeposit = sc.nextDouble();
                account1 =  new BankAccount(name, accountNumber, firstDeposit);
                break;
            } else if (answer.equals("N")) {
                account1 = new BankAccount(name, accountNumber);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }


        System.out.println("Account data");
        System.out.println(account1.toString());

        System.out.println("\nHow much do you want to deposit?");
        double amount = sc.nextDouble();
        account1.deposit(amount);
        System.out.println(account1.toString());

        System.out.println("\nHow much do you want to withdraw?");
        double draft = sc.nextDouble();
        account1.bankDraft(draft);
        System.out.println(account1.toString());

        System.out.println("Updated account data");
        System.out.println(account1.toString());

    }
}
