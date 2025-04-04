package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Scanner sc=new Scanner(System.in);

        System.out.println( "Enter rectangle width and height:" );
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.println( "The area of the rectangle is: " + rec.area());
        System.out.println( "The perimeter of the rectangle is: " + rec.perimeter());
        System.out.println( "The diagonal of the rectangle is: " + rec.diagonal());

    }
}
