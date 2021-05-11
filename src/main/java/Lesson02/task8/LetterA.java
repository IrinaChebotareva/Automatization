package main.java.Lesson02.task8;

public class LetterA {

    public static void main(String[] args) {
        int letterA = 40;
        caseLetterABreak(letterA);
        caseLetterANoBreak(letterA);
    }

    public static void caseLetterABreak(int a) {

        switch (a) {
            case (1):
                System.out.println("A");
                break;
            case (2):
                System.out.println("AA");
                break;
            case (3):
                System.out.println("AAA");
                break;
            case (4):
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }

    public static void caseLetterANoBreak (int a) {
        switch (a) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");

        }
    }

}
