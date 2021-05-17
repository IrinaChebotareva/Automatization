package Lesson01.task3;

public class OddOrEven {

    boolean isOdd(int n) {
        return  (n % 2 == 0);
    }

    public static void main(String[] args) {
        OddOrEven oddOrEven = new OddOrEven();
        System.out.println(oddOrEven.isOdd(14));
        System.out.println(oddOrEven.isOdd(19));
    }

}
