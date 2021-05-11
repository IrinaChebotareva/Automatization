package main.java.Lesson02.task3;

public class FindString {

    public static void main(String[] args) {

        String string1 = "+7(910)423-73-12";
        String string2 = "7(910)423-73-12";
        String string3 = "89215310934";
        String string4 = "+5(911)310-12-74";
        String string5 = "+7(9fg)125-42-99";
        String string6 = "+7(9fg)125-42-99";
        String string7 = "+7(122)2342343";
        String string8 = "2342343";
        String string9 = "9261522585";


        new FindString().matchString(string1);
        new FindString().matchString(string2);
        new FindString().matchString(string3);
        new FindString().matchString(string4);
        new FindString().matchString(string5);
        new FindString().matchString(string6);
        new FindString().matchString(string7);
        new FindString().matchString(string8);
        new FindString().matchString(string9);

    }

    public boolean matchString(String stringStr) {
        boolean matches = stringStr.matches("^\\+\\d{1}\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}$");
        if (matches) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    return true;
    }
}

