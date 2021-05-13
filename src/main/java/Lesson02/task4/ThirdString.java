package Lesson02.task4;

public class ThirdString {
    public static void main(String[] args) {
        String string1 = "ping";
        String string2 = "pong";
        char[] result1 = string1.toCharArray();
        char[] result2 = string2.toCharArray();

        sequenceChars(result1, result2);
    }


    public static void sequenceChars(char[] result1, char[] result2) {
        String newStr = "";
        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result2.length; j++) {
                if (result1[i] == result2[j]) {
                    newStr = newStr + result1[i];
                }
            }
        }
        String outputString = newStr.replaceAll("(.)(?=.*\\1)", "");


        char[] commonString = outputString.toCharArray();
        for (int i = 0; i < commonString.length - 1; i++) {
            for (int j = commonString.length - 1; j > i; j--) {
                if (commonString[j - 1] > commonString[j]) {
                    char tmp = commonString[j - 1];
                    commonString[j - 1] = commonString[j];
                    commonString[j] = tmp;
                }
            }
        }
        System.out.println(commonString);


    }

}
