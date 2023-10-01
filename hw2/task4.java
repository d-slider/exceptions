package hw.hw2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = "";
            boolean isValidInput = false;

            while (!isValidInput) {
                try {
                    System.out.print("Введите строку: ");
                    input = scanner.nextLine();

                    if (input.isEmpty()) {
                        throw new Exception("Пустые строки вводить нельзя!");
                    }

                    isValidInput = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Вы ввели строку: " + input);
        }
    }
}
