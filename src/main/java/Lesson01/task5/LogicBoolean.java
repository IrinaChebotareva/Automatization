package main.java.Lesson01.task5;

public class LogicBoolean {

    boolean a;
    boolean b;

    boolean logicOr (boolean a, boolean b) {
        return ! (a || b);
    }

    boolean logicAnd (boolean a, boolean b) {
        return !a && !b;
            }

    public static void main(String[] args) {
        LogicBoolean logicBoolean = new LogicBoolean();
        System.out.println(logicBoolean.logicOr(false, false));
        System.out.println(logicBoolean.logicOr(false, true));
        System.out.println(logicBoolean.logicOr(true, false));
        System.out.println(logicBoolean.logicOr(true, true));
        System.out.println(logicBoolean.logicAnd(false, false));
        System.out.println(logicBoolean.logicAnd(false, true));
        System.out.println(logicBoolean.logicAnd(true, true));
        System.out.println(logicBoolean.logicAnd(true, true));

    }
}
