package main.java.Lesson02.task1;

import java.util.Arrays;

public class Week {

    public static void main(String[] args) {

        String[] week = {"Пятница", "это", "лучший", "день", "недели"};
        int lengthOfWeek = week.length;
        int j = 0;
        String string1 = "";


        for (int i = 0; i < lengthOfWeek - 1; i++) {
            System.out.printf(week[i] + " ");
        }

        System.out.printf(week[lengthOfWeek - 1] + '.');
        System.out.println();

        for (String i : week) {
             string1 += (i + " ");

        }

        System.out.printf(string1.trim() + '.');
        System.out.println();


        while (j < lengthOfWeek - 1) {
            System.out.printf(week[j] + " ");
            j++;
        }

        System.out.printf(week[lengthOfWeek-1] + '.');
        System.out.println();
    }
}
