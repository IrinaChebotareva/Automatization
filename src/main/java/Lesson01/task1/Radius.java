package Lesson01.task1;

public class Radius {
    final double PI = 3.14;

    public double squareOfCircle(int radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Radius radius = new Radius();
        System.out.println(radius.squareOfCircle(0));
        System.out.println(radius.squareOfCircle(2));
        System.out.println(radius.squareOfCircle(100));
    }


}




