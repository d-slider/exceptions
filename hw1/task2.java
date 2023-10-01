package hw.hw1;

public class task2 {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

/*
1. NumberFormatException: Если элемент массива arr не может быть преобразован в целое число с помощью метода 
Integer.parseInt(), то будет выброшено исключение NumberFormatException.

2. ArrayIndexOutOfBoundsException: Если индекс i превышает длину массива arr или индекс j превышает 4 
(так как используется фиксированное значение 5 во внутреннем цикле), будет выброшено исключение ArrayIndexOutOfBoundsException.

3. NullPointerException: Если arr является нулевой ссылкой (null), будет выброшено исключение NullPointerException.

4. IllegalArgumentException: Если элемент массива arr[i][j] не может быть преобразован в строку, передаваемую в метод 
Integer.parseInt(), то будет выброшено исключение IllegalArgumentException.
 */