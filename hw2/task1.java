package hw.hw2;

import java.util.Scanner;

public class task1 {
    public static float getFloatInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            float number = 0;
            boolean isValidInput = false;

            while (!isValidInput) {
                System.out.print("Введите дробное число: ");
                String input = scanner.nextLine();

                try {
                    number = Float.parseFloat(input);
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                }
            }

            return number;
        }
    }

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }
}
