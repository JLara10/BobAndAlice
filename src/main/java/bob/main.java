package bob;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("What is your name: ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("Alice")) {
                System.out.println("Welcome Alice");
                break;
            } else if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome Bob");
                break;
            } else {
                System.out.println("Please try again.");
            }
        } while (true);

        scanner.close();

        }
    }

