package main.java.Lesson01.task3;

    public class OddOrEven {
        int n = 0;

        boolean isOddOrEven(int n) {
            if (n % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }

    public static void main(String[] args) {
        OddOrEven oddOrEven = new OddOrEven();
        System.out.println(oddOrEven.isOddOrEven(14));
        System.out.println(oddOrEven.isOddOrEven(19));



    }

}
