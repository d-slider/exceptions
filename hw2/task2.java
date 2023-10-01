package hw.hw2;

/*
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
--------------------------------------------
Ошибки:
- Попытка разделить элемент массива intArray[8] на 0, что приведет к исключению ArithmeticException. 
- Объявление переменной catchedRes1 как тип double, хотя результат деления целого числа на целое число будет иметь тип int.
Исправления:
- Явное приведение типа (double) к одному из операндов деления, чтобы результат был типа double. 
- Инициализация массива intArray перед использованием его элементов.
--------------------------------------------
*/
public class task2 {

    public static void main(String[] args) {

        try {
            int[] intArray = new int[10];
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}