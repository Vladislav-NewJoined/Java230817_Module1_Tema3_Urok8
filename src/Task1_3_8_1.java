public class Task1_3_8_1 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            1. Реализуйте методы, max(x,y) - для целых, вещественных чисел, и для строк (в
               случае строк - возвращает самую длинную)

            Решение:\s""");

        MaxValue maxValue = new MaxValue();

        System.out.println("Реализуем перегружаемые методы max:  \n");

        max(maxValue,10, 20);  //  для метода max с переменными Integer
        max(maxValue,100., 50.);  //  для метода max с переменными Double
        max(maxValue,"Строка Один", "Строка Два");  //  для метода max с переменными String
    }

    //  Реализуем перегружаемые методы
    static void max(MaxValue peremennaya, int x, int y) {
        peremennaya.maxInt = 0;
        System.out.println("С методом max c переменными Integer: ");
        System.out.println("Исходные переменные: x = " + x + ", y = " + y);
        if (x>y) {
            peremennaya.maxInt = x;
            System.out.println("Наибольшее значение имеет x = " + peremennaya.maxInt);
        } else if (y>x) {
            peremennaya.maxInt = y;
            System.out.println("Наибольшее значение имеет y = " + peremennaya.maxInt);
        } else {
            System.out.println("Некорректный ввод x и y. Попробуйте еще раз.");
        }
        System.out.println();  //  перенос строки
    }

    static void max(MaxValue peremennaya, double x, double y) {
        peremennaya.maxDouble = 0;
        System.out.println("С методом max c переменными Double: ");
        System.out.println("Исходные переменные: x = " + x + ", y = " + y);
        if (x>y) {
            peremennaya.maxDouble = x;
            System.out.println("Наибольшее значение имеет x = " + peremennaya.maxDouble);
        } else if (y>x) {
            peremennaya.maxDouble = y;
            System.out.println("Наибольшее значение имеет y = " + peremennaya.maxDouble);
        } else {
            System.out.println("Некорректный ввод x и y. Попробуйте еще раз.");
        }
        System.out.println();  //  перенос строки
    }

    static void max(MaxValue peremennaya, String firstStr, String secondStr) {
        peremennaya.maxString = 0;
        System.out.println("С методом max c переменными Srting: ");
        int x = firstStr.length();
        int y = secondStr.length();

        System.out.println("Исходные строки: firstStr = \"" + firstStr + "\", secondStr = \"" + secondStr + "\"");
        if (x>y) {
            peremennaya.maxString = x;
            System.out.println("Наибольшую длину имеет строка firstStr, \"" + firstStr + "\", кол-во символов = " + peremennaya.maxString);
        } else if (y>x) {
            peremennaya.maxString = y;
            System.out.println("Наибольшую длину имеет строка secondStr, \"" + secondStr + "\", кол-во символов = " + peremennaya.maxString);
        } else {
            System.out.println("Некорректный ввод строк firstStr и secondStr. Попробуйте еще раз.");
        }
    }
}

class MaxValue {
    int maxInt;
    double maxDouble;
    int maxString;
}