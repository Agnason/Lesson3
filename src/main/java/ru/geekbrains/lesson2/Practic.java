package ru.geekbrains.lesson3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
// 1.Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

public class Practic {

    public static void main(String[] args) {
       game();
        /* int a = getComputerRandom();
        System.out.println("Программа только что сгенерировала число от 0 до 9");
        System.out.println("Попробуйте угадать число");
        int count = 3;
        while (count != 0) {
            System.out.println("У Вас осталось " + count + " попыток");
            int b = getNumberFromScanner("Введите от 0 до 9", 0, 9);
            if (a == b ) {
                System.out.println("Вы угадали!");
                break;
            }
            checkAnswer(a,b);
            count--;
            if (count == 0) {
                System.out.println("Вы проиграли. " + "Сгенерированное число - " + a);
            }
        }*/
        repeatGame();
    }

        public static int getComputerRandom (){
            Random rand = new Random();
            int numberComputerRandom = rand.nextInt(9);
            return numberComputerRandom;
        }
    public static int getNumberFromScanner(String message, int min, int max) {
       Scanner sc = new Scanner(System.in);
        int number;
        do{
           System.out.println(message);
           number= sc.nextInt();
       } while (number < min || number > max);
        return number;
    }
    public static void checkAnswer (int a, int b) {
            if (a < b) {
                System.out.println("Вы ввели больше,чем загаданное");
            } else {
                System.out.println("Вы ввели меньше, чем загаданное");
            }

        }
    public static void repeatGame (){
        while (true) {
            System.out.println("Повторить игру еще раз?");
            int a = getNumberFromScanner("1 – да / 0 – нет", 0, 1);
            if (a == 1) {
                game();
            } else {
                System.out.println("До встречи");
                break;
            }
        }
    }
    public static void game (){
        int a = getComputerRandom();
        System.out.println("Программа только что сгенерировала число от 0 до 9");
        System.out.println("Попробуйте угадать число");


        int count = 3;
        while (count != 0) {
            System.out.println("У Вас осталось " + count + " попыток");
            int b = getNumberFromScanner("Введите от 0 до 9", 0, 9);
            if (a == b ) {
                System.out.println("Вы угадали!");
                break;
            }
            checkAnswer(a,b);
            count--;
            if (count == 0) {
                System.out.println("Вы проиграли. " + "Сгенерированное число - " + a);
            }
        }
    }
}









