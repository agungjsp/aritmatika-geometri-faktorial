import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner and ask the user to input the number of numbers to be printed
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak angka yang mau dicetak [2..10]: ");
        int numberOfNumbers = scanner.nextInt();

        // Validate the number of numbers entered at least 2 and a maximum of 10
        while (numberOfNumbers < 2 || numberOfNumbers > 10) {
            System.out.print("Angka harus diantara 2 dan 10. Masukkan kembali banyak angka: ");
            numberOfNumbers = scanner.nextInt();
        }

        // Ask the user to input the common difference
        System.out.print("Masukkan beda masing-masing angka [2..9]: ");
        int commonDifference = scanner.nextInt();

        // Validate the number of numbers entered at least 2 and a maximum of 9
        while (commonDifference < 2 || commonDifference > 9) {
            System.out.print("Beda harus diantara 2 dan 9. Masukkan kembali beda: ");
            commonDifference = scanner.nextInt();
        }
        // Call arithmeticSequence, geometricSequence and factorialSequence methods
        arithmeticSequence(numberOfNumbers, commonDifference);
        System.out.println();
        geometricSequence(numberOfNumbers, commonDifference);
        System.out.println();
        factorialSequence(numberOfNumbers);

        // If the user wants to continue, call the main method again
        // Otherwise, exit the program
        System.out.print("Apakah anda ingin mengulang program? [y/n]: ");
        String answer = scanner.next();
        if (answer.equals("y")) {
            main(args);
        } else {
            System.exit(0);
        }
    }

    // Create a method that print value the Arithmetic Sequence horizontally
    public static void arithmeticSequence(int numberOfNumbers, int commonDifference) {
        int firstNumber = 1;
        // Formula for Arithmetic Sequence
        int lastNumber = firstNumber + (numberOfNumbers - 1) * commonDifference;

        System.out.println("Deret aritmatika: ");
        for (int i = firstNumber; i <= lastNumber; i += commonDifference) {
            System.out.print(i + " ");
        }
    }

    // Create a method that print value the Geometric Sequence horizontally
    public static void geometricSequence(int numberOfNumbers, int commonRatio) {
        int firstNumber = 1;
        // Formula for Geometry Sequence
        int lastNumber = firstNumber * (int) Math.pow(commonRatio, numberOfNumbers - 1);

        System.out.println("Deret geometri: ");
        for (int i = firstNumber; i <= lastNumber; i *= commonRatio) {
            System.out.print(i + " ");
        }
    }

    // Create a method that print value the Factorial
    public static void factorialSequence(int numberOfNumbers) {
        int factorial = 1;
        System.out.println("Faktorial dari " + numberOfNumbers + ":");
        for (int i = numberOfNumbers; i > 0; i--) {
            // Formula for Factorial
            factorial *= i;
            System.out.print(i + " ");
            if (i > 1) {
                System.out.print("* ");
            }
        }

        System.out.println("= " + factorial);
    }
}
