package main.java.Lesson02.task2;

import java.lang.reflect.Array;

public class ChessDesk {

    public static void main(String[] args) {
        int[][] array = new int[8][8];

        //объявление массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }

        //вывод массива через for
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //вывод массива через foreach
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //вывод массива через while
        int i = 0;
        int j = 0;
        while (i < array.length) {
            j = 0;
            while (j < array.length) {

                System.out.print(array[i][j]);
                j++;
            }

            i++;
            System.out.println();

        }


    }
}
