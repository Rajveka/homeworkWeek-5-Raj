package calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice;

        do {
            System.out.print("Enter first Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second Number: ");
            int num2 = scanner.nextInt();

            System.out.print("Please enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            calc.calculateResult(num1, num2, symbol);

            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
