//Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов
//Написать метод для получения информации о количестве.
package Task2;

public class Home {
    private static int homeCount = 0;

    public Home(){

        homeCount++;
    }

    public static int getHomeCount(){

        return homeCount;
    }
}