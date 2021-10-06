package Moreno;

import java.util.Scanner;

public class MyName{

    private String getName() {
        String name = "Andres";
        return name;
    }

    private String compName() {
        System.out.println("Enter you name (team member): ");
        String comp = _scanner.nextLine();
        return comp;
    }
    // By marking this "static final" it acts like a constant.
    private static final Scanner _scanner = new Scanner( System.in );

    public static void main(String[] args) {
        MyName name = new MyName();
        String n = name.getName();
        String p = name.compName();
        System.out.println("Hello " + p + "! My name is " + n + " :)");
    }
}