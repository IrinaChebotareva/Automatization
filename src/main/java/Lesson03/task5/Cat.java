package Lesson03.task5;

import java.util.Random;

public class Cat {
    int age;
    String name;

    public Cat() {
        name = Names.getRandomCatName();
        age = new Random().nextInt(15);

    }
}
