package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Fighter 1:");
        Fighter f1 = createFighter(scanner);

        System.out.println("Enter details for Fighter 2:");
        Fighter f2 = createFighter(scanner);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }

    private static Fighter createFighter(Scanner scanner) {
        System.out.print("Enter fighter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter damage: ");
        int damage = scanner.nextInt();

        System.out.print("Enter health: ");
        int health = scanner.nextInt();

        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();

        System.out.print("Enter dodge chance: ");
        double dodge = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        return new Fighter(name, damage, health, weight, dodge);
    }
}
