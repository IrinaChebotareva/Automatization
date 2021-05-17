package Lesson01.task2;

public class Rectangle {

    /**
     * Сравниваем площадь и периметр прямоугольника.
     * @param width - ширина прямоугольника
     * @param height - высота прямоугольника
     * @return true, если площадь больше периметра, false - если наоборот
     */
    boolean getComparisonResult(int width, int height) {
        return  ((width * height) > (2 * (width + height)));
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getComparisonResult(2, 7));
        System.out.println(rectangle.getComparisonResult(6, 5));
        System.out.println(rectangle.getComparisonResult(6, 3));
    }
}
