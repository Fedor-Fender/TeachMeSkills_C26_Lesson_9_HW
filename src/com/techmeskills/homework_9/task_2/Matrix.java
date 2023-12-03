package com.techmeskills.homework_9.task_2;

import static com.techmeskills.homework_9.task_2.Utils.showInfMatrix;

/**
 * Доработайте задачу из домашнего задания №5.
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 * Создайте класс Utils.
 * Данном классе создайте статический метод для вывода матрицы на экран используюя Syste.out.println.
 * Метод на вход должные принимать двумерный массив, а на выход он не должен ничего возвращать.
 * Используйте этот статический метод в классе для решения задачи умножения матриц.
 * Используйте этот статический метод для вывода матрицы на экран трижды - вывод первой матрицы, вывод второй матрицы, вывод результата.
 */
public class Matrix {
    public static void main(String[] args) {

//        to create original two-dimensional arrays
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1,0}};

        System.out.println("Output array1:");
        Utils.showInfMatrix(array1);
        System.out.println("Output array2:");
        Utils.showInfMatrix(array2);

        int[][] array3 = new int[array1.length][array2[0].length];

//        to check out arrays to opportunity multiplication
        if (array1[0].length!= array2.length) {
            System.out.println("It's wrong size,try it again");
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println("Output array3:");
        Utils.showInfMatrix(array3);
    }
}
