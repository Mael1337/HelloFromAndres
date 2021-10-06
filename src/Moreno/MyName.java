package Moreno;

import java.util.Scanner;

public class MyName{

    private String getName() {
        System.out.print("Enter the name: ");
        String name= _scanner.nextLine();
        return name;
    }

    private void displayArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.format("\tArea: %.2f\n", area);
    }
    // By marking this "static final" it acts like a constant.
    private static final Scanner _scanner = new Scanner( System.in );

    public static void main(String[] args) {
        MyName name = new MyName();
        String n = name.getName();
        System.out.println("Hello my name is " + n);
    }
}