package main.java.Lesson01.task4;

public class Centimeter {
    int centimeter = 0;

    int becomeMeter(int centimeter) {
        int meter = centimeter / 100;
        return meter;
    }

    public static void main(String[] args) {
        Centimeter meter = new Centimeter();
        System.out.println(meter.becomeMeter(115));
        System.out.println(meter.becomeMeter(800));
        System.out.println(meter.becomeMeter(278));
    }
}
