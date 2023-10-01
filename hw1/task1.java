package hw.hw1;
/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */
public class task1 {
    public static void divide(int a, int b) { //Метод, выбрасывающий ArithmeticException:
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        int result = a / b;
        System.out.println("Результат деления: " + result);
    }

    public static void printLength(String str) { //Метод, выбрасывающий NullPointerException:
        if (str == null) {
            throw new NullPointerException("Передана пустая строка");
        }
        int length = str.length();
        System.out.println("Длина строки: " + length);
    }

    public static void accessArrayElement(int[] array, int index) { //Метод, выбрасывающий ArrayIndexOutOfBoundsException:
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Недопустимый индекс массива");
        }
        int element = array[index];
        System.out.println("Элемент массива: " + element);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            printLength(null);
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            accessArrayElement(new int[] { 1, 2, 3 }, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
