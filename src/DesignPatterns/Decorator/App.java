package DesignPatterns.Decorator;

public class App {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new FarmHousePizza());
        System.out.println(basePizza.cost());
    }
}
