import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Main {
    //1
    public static int max(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Числа равны");
        }
        return Math.max(a, b);
    }

    //2
    public static double devide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    //3
    public static int stringToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат числа.");
        }
    }

    //4
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне 0-150");
        }
    }

    //5
    public static double root(double number, double degree) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        return Math.pow(number, 1.0 / degree);
    }

    //6
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //7
    public static void checkForZeros(int[] arr) {
        for (int i : arr) {
            if (i == 0) {
                throw new IllegalArgumentException("Массив содержит нули.");
            }
        }
    }

    //8
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной.");
        }
        return Math.pow(base, exponent);
    }

    //9
    public static String trimStr(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }

    //10
    public static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден.");
    }

    //11
    public static String toBinaryString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        return Integer.toBinaryString(n);
    }

    //12
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Нельзя делить на 0 :(");
        }
        return a % b == 0;
    }

    // 13
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IllegalArgumentException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    //14
    public static void checkPasswordStrength(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("WeakPasswordException");
        }
    }

    //15
    public static void validateDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Неверный формат даты.");
        }
    }

    //16
    public static String concatenate(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Одна или обе строки равны null");
        }
        return s1 + s2;
    }

    //17
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("АТАТАТА деление на ноль решил да? Не надо так!");
        }
        return a % b;
    }

    //18
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("a < 0");
        }
        return Math.sqrt(a);
    }

    //19
    public static double celToFar(double cel) {
        if (cel < 273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return cel * 9 / 5 + 32;
    }

    //20
    public static void checkStr(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста или равна null");
        }
    }

}