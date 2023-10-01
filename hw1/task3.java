package hw.hw1;

/*
 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException.
 */
public class task3 {

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 2, 4, 6, 12};

        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println("Результат деления массивов:");
            for (int value : result) {
                System.out.println(value);
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }
}
