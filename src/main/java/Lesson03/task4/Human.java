package Lesson03.task4;

import java.util.Arrays;

public class Human {
    String name;

    Human[] friends = new Human[3];  //почему 3???
    Human[] newFriends = new Human[0];  //экземпляр класса, массив

    Human (String name){
        this.name = name;
    }  ///конструктор, в параметрах - имя

    /**
     * Добавляет друга человеку. Вызывает аналогичный метод добавления себя у добавленного друга
     *
     * @param friend - человек, с которым надо подружиться :)
     */
    void addFriend(Human friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriend(this);
    }



    void addNewFriend(Human friend) {
        for (Human currentFriend : newFriends) {
            if (currentFriend == friend)
                return;
        }
        int currentCount = newFriends.length;
        newFriends = Arrays.copyOf(newFriends, currentCount + 1);
        newFriends[currentCount] = friend;
        friend.addNewFriend(this);
    }
}
