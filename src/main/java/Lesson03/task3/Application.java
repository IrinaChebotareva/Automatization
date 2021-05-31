package Lesson03.task3;

public class Application {

    public static void main(String[] args) {

        // бабушки, дедушки
        Human dadOfFather = new Human("Валерий", 75, null, null);
        Human momOfFather = new Human("Александра", 70, null, null);
        Human dadOfMother = new Human("Иван", 72, null, null);

        // родители
        Human mom = new Human("Марина", 35, dadOfMother, null);
        Human dad = new Human("Сергей", 40, dadOfFather, momOfFather);

        // дети
        Human son = new Human("Виталий", 10, dad, mom);
        Human dother = new Human("Елена", 11, dad, mom);

        Human[] grandParents = new Human[4];
        int index = 0;

        for (int i = 0; i < 2; i++) {
            Human[] parentParents = dother.parents[i].parents; //экземпляр массива конструктора = ссылке на элемент массива полей конструктора
            for (int j = 0; j < parentParents.length; j++) {
                grandParents[index++] = parentParents[j];
            }
        }

        for (Human grands : grandParents) {
            if (grands != null) System.out.printf("%s (%d лет)%n", grands.name, grands.age);
        }
    }

}
