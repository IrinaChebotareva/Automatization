package main.java.Lesson02.task7;

public class Ages {
    public static void main(String[] args) {
        int age = 112;
        ageOfPerson(age);

    }

    public static void ageOfPerson(int age) {
        if (age >= 25 && age < 44) {
            System.out.println("Молодой возраст");
        } else if (age >= 44 && age < 60) {
            System.out.println("Средний возраст");
        } else if (age >= 60 && age < 75) {
            System.out.println("Пожилой возраст");
        } else if (age >= 75 && age < 90) {
            System.out.println("Старческий возраст");
        } else {
            System.out.println("Неизвестный возраст");
        }
    }
}
