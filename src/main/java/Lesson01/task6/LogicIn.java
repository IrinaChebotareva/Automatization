package main.java.Lesson01.task6;

public class LogicIn {
    boolean a;
    boolean b;
    boolean c;
    boolean d;

    boolean logicIn (boolean a, boolean b, boolean c, boolean d) {
        return ((a && b) && ! (c || d));
    }

    public static void main(String[] args) {
        LogicIn logicIn = new LogicIn();
        System.out.println(logicIn.logicIn(false, false, false, false));
        System.out.println(logicIn.logicIn(true, true, true, true));
        System.out.println(logicIn.logicIn(false, true, false, true));
        System.out.println(logicIn.logicIn(true, false, true, false));
        System.out.println(logicIn.logicIn(true, true, false, false));

    }
}
