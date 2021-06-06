package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String str = in.nextLine();

        System.out.printf("%s has %d characters.\n", str, str.length());
    }
}
