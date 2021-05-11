package main.java.Lesson02.task6;

public class Transponation2 {
    public static void main(String[] args) {


        int[][] a = {{1,0,1,0,0},{0,1,0,2,1},{0,1,0,1,0}};
        System.out.println(a[0].length);
        // выводим на экран начальную матрицу
        System.out.println("Исходный массив");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

        // замена значений после 2
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] ==2) {
                   int temp = a[i][j];

                }
            }
            System.out.println();
        }

        // выводим на экран транспонированную матрицу
//        System.out.println();
//        System.out.println("Новая матрица");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.printf("%3d", a[i][j]);
//            }
//            System.out.println();
//        }
    }
}
