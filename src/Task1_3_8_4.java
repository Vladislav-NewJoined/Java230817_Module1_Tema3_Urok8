import java.util.Arrays;

public class Task1_3_8_4 {
    public static void main(String[] args)
    {
        System.out.println("""
                Задание:\s
                4. Реализуйте методы merge(int[] array1, int[] array2), merge(int[] array1, int[]
                   array2,int[] array3), merge(int[] array1, int[] array2, int[] array3, int[] array4) -
                   который возвращает новый массив, в котором он соединяет все предыдущие
                   (было 3 массива по 10 элементов, станет массив с 20 элементами)

                Решение:\s""");

        MergeArrays mergeArrays = new MergeArrays();

        System.out.println("Должен сделать оговорку, что мне не совсем понятна суть задания. Мною выведен результат " +
                "в соответствии с тем, как я понял суть задания. \n");

        // первый массив
        int array1[] = {11, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        // второй массив
        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // третий массив
        int array3[] = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1000};

        System.out.println("Исходный массив array1, 10 элементов: " + Arrays.toString(array1));
        System.out.println("Исходный массив array2, 10 элементов: " + Arrays.toString(array2));
        System.out.println("Исходный массив array3, 10 элементов: " + Arrays.toString(array3));
        System.out.println();  //  перенос строки

        mergeArrays.pred_array4 = merge(mergeArrays, array1, array2);
        System.out.println("Результат слияния array1 и array2, массив pred_array4, 10 элементов: " + Arrays.toString(mergeArrays.pred_array4));

        mergeArrays.array4 = merge(mergeArrays, array1, array2, array3);
        System.out.println("Результат слияния array1, array2 и array3, массив array4, 20 элементов: " + Arrays.toString(mergeArrays.array4));
    }

    static int[] merge(MergeArrays perem, int[] array1, int[] array2) {
        // определяем длину первого массива
        int a1 = array1.length;
        // определяем длину второго массива
        int b1 = array2.length;
        // задаем длину результирующего массива
        int c1 = 10;

        // создаем результирующий массив
        int[] c = new int[c1];
        int quantFrom1 = 5;  //  счетчик, сколько элементов берём из первого массива
        int quantFrom2 = 5;  //  счетчик, сколько элементов берём из второго массива

        // цикл для сохранения элементов первого массива в результирующий массив
        for (int i = 0; (i < quantFrom1 && i < c1); i++) {
            if (i >= a1 || i >= c1) {
                break; // завершить цикл, если вышли за пределы массива
            }
            c[i] = array1[i];
        }

        for (int i = 0; (i < quantFrom2 && i < c1); i++) {
            // цикл для сохранения элементов второго массива в результирующий массив
            if (i >= b1 || i >= c1-quantFrom1) {
                break; // завершить цикл, если вышли за пределы массива
            }
            c[i+quantFrom1] = array2[i];
        }

        int targetIndex = 0;
        for( int sourceIndex = 0;  sourceIndex < c.length;  sourceIndex++ )
            if( c[sourceIndex] != 0 )
                c[targetIndex++] = c[sourceIndex];
        perem.pred_array4 = new int[targetIndex];
        System.arraycopy( c, 0, perem.pred_array4, 0, targetIndex );

        return perem.pred_array4;
    }
    static int[] merge(MergeArrays perem, int[] array1, int[] array2, int[] array3) {
        // определяем длину первого массива
        int a1 = array1.length;
        // определяем длину второго массива
        int b1 = array2.length;
        // определяем длину третьего массива
        int c1 = array3.length;
        // задаем длину результирующего массива
        int d1 = 20;

        // создаем результирующий массив
        int[] d = new int[d1];
        int quantFrom1 = 6;  //  счетчик, сколько элементов берём из первого массива
        int quantFrom2 = 6;  //  счетчик, сколько элементов берём из второго массива
        int quantFrom3 = 8;  //  счетчик, сколько элементов берём из третьего массива

        // цикл для сохранения элементов первого массива в результирующий массив
        for (int i = 0; (i < quantFrom1 && i < d1); i++) {
            // Storing the elements in
            // the resultant array
            if (i >= a1 || i >= d1) {
                break; // завершить цикл, если вышли за пределы массива
            }
            d[i] = array1[i];
        }

        for (int i = 0; (i < quantFrom2 && i < d1); i++) {
            // цикл для сохранения элементов второго массива в результирующий массив
            if (i >= b1 || i >= d1-quantFrom1) {
                break; // завершить цикл, если вышли за пределы массива
            }
            d[i+quantFrom1] = array2[i];
        }

        for (int i = 0; (i < quantFrom3 && i < d1); i++) {
            // цикл для сохранения элементов третьего массива в результирующий массив
            if (i >= c1 || i >= d1-quantFrom1-quantFrom2) {
                break; // завершить цикл, если вышли за пределы массива
            }
            d[i+quantFrom1+quantFrom2] = array3[i];
        }

        int targetIndex = 0;
        for( int sourceIndex = 0;  sourceIndex < d.length;  sourceIndex++ )
            if( d[sourceIndex] != 0 )
                d[targetIndex++] = d[sourceIndex];
        perem.array4 = new int[targetIndex];
        System.arraycopy( d, 0, perem.array4, 0, targetIndex );

        return perem.array4;
    }
}

class MergeArrays {
    int[] pred_array4;
    int[] array4;
}
