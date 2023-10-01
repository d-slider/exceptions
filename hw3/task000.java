import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class task000 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО, разделенные пробелом: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
            String birthDate = scanner.nextLine();

            try {
                validateBirthDate(birthDate);
            } catch (InvalidBirthDateException e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;
            }

            System.out.print("Введите номер телефона: ");
            String phoneNumberStr = scanner.nextLine();
            long phoneNumber;
            try {
                phoneNumber = parsePhoneNumber(phoneNumberStr);
            } catch (InvalidPhoneNumberException e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;
            }

            System.out.print("Введите пол (f - женский, m - мужской): ");
            String genderStr = scanner.nextLine();
            char gender;
            try {
                gender = parseGender(genderStr);
            } catch (InvalidGenderException e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;
            }

            String[] nameParts = fullName.split(" ");

            if (nameParts.length == 3) {
                String lastName = nameParts[0];
                String firstName = nameParts[1];
                String middleName = nameParts[2];

                String data = lastName + firstName + middleName + birthDate + " " + phoneNumber + gender;
                String fileName = lastName + ".txt";

                try {
                    FileWriter fileWriter = new FileWriter(fileName);
                    fileWriter.write(data);
                    fileWriter.close();
                    System.out.println("Данные успешно записаны в файл " + fileName);
                } catch (IOException e) {
                    System.out.println("Ошибка при записи в файл.");
                }
            } else {
                System.out.println("Ошибка: Некорректный ввод ФИО.");
            }
        }
    }

    private static void validateBirthDate(String birthDate) throws InvalidBirthDateException {
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidBirthDateException("Некорректный формат даты рождения.");
        }

        int day = Integer.parseInt(birthDate.substring(0, 2));
        int month = Integer.parseInt(birthDate.substring(3, 5));
        int year = Integer.parseInt(birthDate.substring(6, 10));

        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900) {
            throw new InvalidBirthDateException("Некорректная дата рождения.");
        }
    }

    private static long parsePhoneNumber(String phoneNumberStr) throws InvalidPhoneNumberException {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new InvalidPhoneNumberException("Некорректный формат номера телефона.");
        }
    }

    private static char parseGender(String genderStr) throws InvalidGenderException {
        if (genderStr.length() != 1 || (genderStr.charAt(0) != 'f' && genderStr.charAt(0) != 'm')) {
            throw new InvalidGenderException("Некорректный формат пола.");
        }
        return genderStr.charAt(0);
    }
}

class InvalidBirthDateException extends Exception {
    public InvalidBirthDateException(String message) {
        super(message);
    }
}

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class InvalidGenderException extends Exception {
    public InvalidGenderException(String message) {
        super(message);
    }
}
