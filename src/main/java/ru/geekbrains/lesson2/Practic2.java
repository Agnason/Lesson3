package ru.geekbrains.lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practic2 {
    public static Random rand =new Random();
    public static Scanner sc = new Scanner(System.in);
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        printArr(words);
        checkAnswerWithComputer(getComputerRandomWord(words));
    }

    public static String getComputerRandomWord(String[] arr) {
        int numberComputerRandom = rand.nextInt(arr.length);
        String wordComputer = arr[numberComputerRandom];
        System.out.println("Программа выбрала слово из списка");
        return wordComputer;
    }

    public static void checkAnswerWithComputer(String computer) {
        char [] arr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        for (int i = 0; i < computer.length(); i++) {
            System.out.println("Попробуйте угадать слово");
            String answer = sc.nextLine().toLowerCase();

            if (answer.equals(computer)) {
                System.out.println("Вы угадали");
                break;
            } else {
                System.out.println("Пока не угадали");
                char a = computer.charAt(i);
                arr [i] = a;
                    System.out.println("Подсказка: " + Arrays.toString(arr));
            }
            if (i==computer.length()-1){
                System.out.println("Вы проиграли. Программа выбрала слово: " + computer);
            }
        }
    }

    public static void printArr (String [] words){

        for (int i=0; i< words.length; i++) {
                System.out.println(words [i]);
            }
    }
}




