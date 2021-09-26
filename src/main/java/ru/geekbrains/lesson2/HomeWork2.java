package ru.geekbrains.lesson2;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        changeArrayNumber(0, 1);
        generateArrayArithmeticProgression(3);
        sortArraySmallerAMultiplyB(6, 2);
        generateTwoArrayDiagonalOne(5, 5);
        findArrayMaxAndMin();
        checkBalance();
        caruselArray(4);
        caruselArray(0);
        caruselArray(-1);


    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeArrayNumber(int a, int b) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            // 1 способ
            switch (arr[i]) {
                case (0):
                    arr[i] = b;
                    break;
                case (1):
                    arr[i] = a;
                    break;
                default:
                    System.out.println("Ваш массив должен состоять из 0 и 1");
            }
        }
        // 2 способ
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                arr[i] = b;}
            else arr [i]=a;
        }*/
        System.out.println(Arrays.toString(arr));
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    public static void generateArrayArithmeticProgression(int a) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * a;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом, и числа, меньшие 6, умножить на 2;
    public static void sortArraySmallerAMultiplyB(int a, int b) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            // 1 способ
            arr[i] = (arr[i] < a) ? arr[i] * b : arr[i];
            // 2 способ
            /*if (arr[i] < a) {
                arr[i] = arr[i] * b;
            }*/
        }
        System.out.println(Arrays.toString(arr));
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    public static void generateTwoArrayDiagonalOne(int a, int b) {
        int[][] table = new int[a][b];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }
        printArr(table);
    }

    // метод, с помощью которого распечатываем в консоль двухмерный массив
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    // 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void findArrayMaxAndMin() {
        int[] arr = {0, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("Максимум " + max);
        System.out.println("Минимум " + min);
    }

    // 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
    public static void checkBalance() {
        int[] arr = {0, 2, 2, 0, 4};
        int sumLeft = 0;
        int sumRight = 0;
        boolean result = false;
        int middleIndex = arr.length / 2;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                sumLeft += arr[i];
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                sumRight += arr[i];
            }
            if (sumLeft == sumRight) {
                result = true;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Сумма левой части массива " + sumLeft);
            System.out.println("Сумма правой части массива " + sumRight);
            System.out.println("Результат: " + result);
        } else if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                sumLeft += arr[i];
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                sumRight += arr[i];
            }
            if (sumLeft == sumRight) {
                result = true;
            } else if (sumLeft != sumRight) {
                sumLeft = sumLeft + arr[arr.length / 2];
                sumRight = sumRight - arr[arr.length / 2];
                if (sumLeft == sumRight) {
                    result = true;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println("Сумма левой части массива " + sumLeft);
                System.out.println("Сумма правой части массива " + sumRight);
                System.out.println("Результат: " + result);
            }
        }
    }

    // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.


    public static void caruselArray(int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Было: " + Arrays.toString(arr));
        System.out.println("n=: "+n);
        for (int i = 0; i < Math.abs(n); i++) {
            if (n >= 0) {
                for (int j = 0; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } else {
                for (int j =arr.length-1; j >0; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Стало: " + Arrays.toString(arr));
    }
}
























