public class Task1_3_8_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                1. Реализуйте методы, max(x,y) - для целых, вещественных чисел, и для строк (в
                   случае строк - возвращает самую длинную)

                Решение:\s""");

        MaxValue maxValue = new MaxValue();

        //  Вводим исходные значения
        max(maxValue, 299, 10, 20);  //  для метода max с c переменными Integer
        max(maxValue, 299.99, 100, 50);  //  для метода max с c переменными Double
        max(maxValue, "349", "Строка Один", "Строка Два");  //  для метода max с c переменными String
    }

    //  Реализуем перегруженные методы
    static void max(MaxValue maxValue, int price, int x, int y) {
        System.out.println("С методом max c переменными Integer: ");
        if (x > y) {
            int max = x;
            System.out.println("Наибольшее значение имеет x = " + max);
        } else if (y > x) {
            int max = y;
            System.out.println("Наибольшее значение имеет y = " + max);
        } else {
            System.out.println("Некорректный ввод x и y. Попробуйте еще раз.");
        }
        System.out.println();  //  перенос строки
    }

    static void max(MaxValue balalaika, double price, double x, double y) {
        System.out.println("С методом max c переменными Double: ");
        if (x > y) {
            double max = x;
            System.out.println("Наибольшее значение имеет x = " + max);
        } else if (y > x) {
            double max = y;
            System.out.println("Наибольшее значение имеет y = " + max);
        } else {
            System.out.println("Некорректный ввод x и y. Попробуйте еще раз.");
        }
        System.out.println();  //  перенос строки
    }

    static void max(MaxValue printer, String price, String firstStr, String secondStr) {
        System.out.println("С методом max c переменными String: ");
        int x = firstStr.length();
        int y = secondStr.length();
        if (x > y) {
            int max = x;
            System.out.println("Наибольшую длину имеет строка firstStr, \"" + firstStr + "\", кол-во символов = " + max);
        } else if (y > x) {
            int max = y;
            System.out.println("Наибольшую длину имеет строка secondStr, \"" + secondStr + "\", кол-во символов = " + max);
        } else {
            System.out.println("Некорректный ввод строк firstStr и secondStr. Попробуйте еще раз.");
        }
    }
}

class MaxValue {
}
