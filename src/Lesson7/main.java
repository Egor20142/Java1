package Lesson7;

public class main {
    public static void main(String[] args) {
        cat[] cats = {
                new cat("Lir", 10), new cat("Simon", 50), new cat("Hora", 13)
        };
        plate plate = new plate(50, 30);
        System.out.println(plate);
        for (cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        for (cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }









}
