package Lesson01.task2;

public class Rectangle {

    int width = 0;
    int height = 0;

    boolean resultOfComparison(int width, int height) {
        if ((width * height) > (2 * (width + height))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.resultOfComparison(2, 7));
        System.out.println(rectangle.resultOfComparison(6, 5));
        System.out.println(rectangle.resultOfComparison(6, 3));
    }
}
