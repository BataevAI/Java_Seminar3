package Seminar1;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd


        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        System.out.println("1800 : ");
        System.out.println(isLeapYear(1800));
        System.out.println("1987 : ");
        System.out.println(isLeapYear(1907));
        System.out.println("2000 : ");
        System.out.println(isLeapYear(2000));
        System.out.println("2200 : ");
        System.out.println(isLeapYear(2200));
        System.out.println("1004 : ");
        System.out.println(isLeapYear(1004));

        for (int item : createArray(5,4))
              {
                  System.out.print(item + " ");
        }

        System.out.println("\n");

          /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
            Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

     */
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int item : arrayChangeOneToZero(arr1))
        {
            System.out.print(item + " ");
        }
        System.out.println("\n");
//        2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr2 = { 1, 3, 5, 0, 11, 10, 12, 1, 0, 6 };
        for (int item : arrayChangeMassive6(arr2))
        {
            System.out.print(item + " ");
        }

        System.out.println("\n");

        /* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         * * Также заполнить элементы побочной диагонали
         */
        int[][] arr3 = { {0, 0, 0, 0}, {3, 3, 3, 3}, {4, 4, 4, 4}, {2, 2, 2, 2} };

        printArrSq(squareArray(arr3));

    }
    private static int[][] squareArray(int arr[][]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if ((i == j) | (i + j == arr.length - 1)) {
//&&
                    arr[i][j] = 1;
                }

            }
        }

        return arr;

    }
    private static void printArrSq(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
                }
            System.out.print("\n");
            }
        }





    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if ((a + b <= 20) && (a + b >= 10)) return true;
        else return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) return true;
        else return false;
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++)
            System.out.print(source);

    // напечатать строку source repeat раз
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;

        else return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return array;
    }

    private static void changeTwoNum(int a, int b) {
        int temp = 0;
        temp = a;  a = b; b = temp;

    }
    private static int[] arrayChangeOneToZero(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;

            }
            else arr[i] = 1;
        }
        return arr;
    }

    private static int[] arrayChangeMassive6(int[] arr){
    int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;

            }

        }
        return arr;
    }
}
/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 /* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */